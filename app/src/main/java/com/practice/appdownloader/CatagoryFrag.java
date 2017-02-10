package com.practice.appdownloader;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.practice.appdownloader.http.RetrofitService;
import com.practice.appdownloader.model.CategoryResponse;

import java.util.LinkedList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by usera on 2017/1/22.
 */

public class CatagoryFrag extends Fragment {
    private static final String TAG = CatagoryFrag.class.getSimpleName();

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

    RecyclerView categoryRv;
    View categoryRvEmptyView;
    Retrofit retrofit = null;
    RetrofitService retrofitService = null;
    CategoryRecyclerViewAdapter categoryRecyclerViewAdapter = null;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coolapk.com")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitService = retrofit.create(RetrofitService.class);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_category, container, false);
        categoryRv = (RecyclerView) view.findViewById(R.id.categoryRv);
        categoryRvEmptyView=view.findViewById(R.id.categoryRvEmptyView);
        categoryRv.setLayoutManager(new LinearLayoutManager(getContext()));
        categoryRecyclerViewAdapter = new CategoryRecyclerViewAdapter(this,categoryRv,categoryRvEmptyView);
        categoryRv.setAdapter(categoryRecyclerViewAdapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        retrofitService.getAppCategory()
                .subscribeOn(Schedulers.io())
                .onBackpressureBuffer()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<CategoryResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.e(TAG, "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: " + e);
                    }

                    @Override
                    public void onNext(CategoryResponse categoryResponse) {
                        List<CategoryResponse.Data> datas = new LinkedList<CategoryResponse.Data>();
                        CategoryResponse.Data[] messdatas = categoryResponse.getData();
                        switch (getType()) {
                            case APP: {
                                for (CategoryResponse.Data data : messdatas) {
                                    if (data.getTopid().equals("1")) {
                                        datas.add(data);
                                    }
                                }
                                break;
                            }
                            case GAME: {
                                for (CategoryResponse.Data data : messdatas) {
                                    if (data.getTopid().equals("2")) {
                                        datas.add(data);
                                    }
                                }
                                break;
                            }
                        }
                        categoryRecyclerViewAdapter.addAll(datas);
                    }
                });
    }

    public Type getType() {
        return (Type) getArguments().getSerializable(TYPE_KEY);
    }


}
