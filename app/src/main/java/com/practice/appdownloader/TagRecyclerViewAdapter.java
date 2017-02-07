package com.practice.appdownloader;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gaofeng on 2017-02-07.
 */

public class TagRecyclerViewAdapter extends RecyclerView.Adapter<TagRecyclerViewAdapter.TagRecyclerViewHolder> {
    List<String> tags = new LinkedList<>();

    @Override
    public TagRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TagRecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.tag_item, parent, false));
    }

    @Override
    public void onBindViewHolder(TagRecyclerViewHolder holder, int position) {
        holder.setTag(tags.get(position));
    }

    @Override
    public int getItemCount() {
        return tags.size();
    }

    public void add(String str){
        tags.add(str);
        notifyDataSetChanged();
    }
    public void addAll(List<String> strs){
        tags.addAll(strs);
        notifyDataSetChanged();
    }

    public void addAll(String[] strs){
        for (String str:strs) {
            tags.add(str);
        }
        notifyDataSetChanged();
    }
    public void clear(){
        tags.clear();
    }

    public class TagRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tagTv;

        public TagRecyclerViewHolder(View itemView) {
            super(itemView);
            tagTv = (TextView) itemView.findViewById(R.id.tagTv);
        }

        public void setTag(String str) {
            tagTv.setText(str);
        }
    }
}
