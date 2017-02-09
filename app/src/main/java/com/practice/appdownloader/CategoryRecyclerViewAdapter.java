package com.practice.appdownloader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.practice.appdownloader.model.CategoryResponse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gaofeng on 2017-01-23.
 */

public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewAdapter.CategoryRecyclerViewHolder> {
    LinkedList<CategoryResponse.Data> data = new LinkedList<>();
    Fragment frag;

    public CategoryRecyclerViewAdapter(Fragment frag) {
        this.frag = frag;
    }

    @Override
    public CategoryRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryRecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item, parent, false));
    }

    @Override
    public void onBindViewHolder(CategoryRecyclerViewHolder holder, int position) {
        holder.update(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void add(CategoryResponse.Data d) {
        data.add(d);
        notifyDataSetChanged();
    }

    public void addAll(List<CategoryResponse.Data> ds) {
        data.addAll(ds);
        notifyDataSetChanged();
    }

    public void addAll(CategoryResponse.Data[] ds) {
        for (CategoryResponse.Data d : ds) {
            data.add(d);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        data.clear();
        notifyDataSetChanged();
    }


    public class CategoryRecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView catTitle;
        RecyclerView tagRv;
        TagRecyclerViewAdapter tagRecyclerViewAdapter;
        ChipsLayoutManager chipsLayoutManager;
        CategoryResponse.Data data;
        Target<?> glideTarget = null;

        public CategoryRecyclerViewHolder(final View itemView) {
            super(itemView);
            logo = (ImageView) itemView.findViewById(R.id.logo);
            catTitle = (TextView) itemView.findViewById(R.id.catTitle);
            tagRv = (RecyclerView) itemView.findViewById(R.id.tagRv);
            tagRecyclerViewAdapter = new TagRecyclerViewAdapter();
            chipsLayoutManager = ChipsLayoutManager.newBuilder(itemView.getContext())
                    .setScrollingEnabled(true)
                    .setMaxViewsInRow(10)
                    .setOrientation(ChipsLayoutManager.HORIZONTAL)
                    .setRowStrategy(ChipsLayoutManager.STRATEGY_DEFAULT)
                    .build();
            tagRv.setLayoutManager(chipsLayoutManager);
            tagRv.setAdapter(tagRecyclerViewAdapter);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), CategoryDetailActivity.class);
                    intent.putExtra(CategoryResponse.Data.class.getSimpleName(), data);
                    itemView.getContext().startActivity(intent);
                }
            });
        }

        public void update(CategoryResponse.Data d) {
            data = d;
            catTitle.setText(d.getTitle());
            if (glideTarget != null) {
                Glide.clear(glideTarget);
            }
            glideTarget=Glide.with(frag)
                    .load(d.getLogo())
                    .skipMemoryCache(true)
                    .placeholder(R.drawable.ic_applogo_placeholder)
                    .dontAnimate()
                    .into(logo);
            tagRecyclerViewAdapter.clear();
            tagRecyclerViewAdapter.addAll(d.getTagList());
        }
    }
}
