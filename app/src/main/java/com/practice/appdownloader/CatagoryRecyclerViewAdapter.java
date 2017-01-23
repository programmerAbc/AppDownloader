package com.practice.appdownloader;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.practice.appdownloader.model.CatagoryResponse;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by gaofeng on 2017-01-23.
 */

public class CatagoryRecyclerViewAdapter extends RecyclerView.Adapter<CatagoryRecyclerViewAdapter.CatagoryRecyclerViewHolder> {
    LinkedList<CatagoryResponse.Data> data = new LinkedList<>();

    @Override
    public CatagoryRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CatagoryRecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item, parent, false));
    }

    @Override
    public void onBindViewHolder(CatagoryRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void add(CatagoryResponse.Data d) {
        data.add(d);
        notifyDataSetChanged();
    }

    public void addAll(List<CatagoryResponse.Data> ds) {
        data.addAll(ds);
        notifyDataSetChanged();
    }


    public class CatagoryRecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView catTitle;
        RecyclerView tagRv;

        public CatagoryRecyclerViewHolder(View itemView) {
            super(itemView);
            logo= (ImageView) itemView.findViewById(R.id.logo);
            catTitle= (TextView) itemView.findViewById(R.id.catTitle);
            tagRv= (RecyclerView) itemView.findViewById(R.id.tagRv);
        }

        public void update(CatagoryResponse.Data d){
            catTitle.setText(d.getTitle());

        }
    }
}
