package com.practice.appdownloader;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by usera on 2017/1/22.
 */

public class CatagoryFrag extends Fragment {
    public enum Type {
        APP("应用"), GAME("游戏");
        String description;

        Type(String desctiption) {
            this.description = desctiption;
        }

        @Override
        public String toString() {
            return description;
        }
    }

    public static final String TYPE_KEY = "TYPE_KEY";


    public static CatagoryFrag newInstance(Type type) {

        Bundle args = new Bundle();
        args.putSerializable(TYPE_KEY, type);
        CatagoryFrag frag = new CatagoryFrag();
        frag.setArguments(args);
        return frag;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_catagory, container, false);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        tv.setText(getArguments().getSerializable(TYPE_KEY).toString());
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public Type getType() {
        return (Type) getArguments().getSerializable(TYPE_KEY);
    }


}
