package com.practice.appdownloader;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.Target;
import com.practice.appdownloader.model.CategoryDetailResponse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gaofeng on 2017-01-23.
 */

public class CategoryDetailRecyclerViewAdapter extends RecyclerView.Adapter<CategoryDetailRecyclerViewAdapter.CategoryDetailRecyclerViewHolder> {
    LinkedList<CategoryDetailResponse.Data> data = new LinkedList<>();
    Fragment frag;
    RecyclerView recyclerView;
    View emptyView;

    public CategoryDetailRecyclerViewAdapter(Fragment frag, RecyclerView recyclerView, View emptyView) {
        this.frag = frag;
        this.recyclerView = recyclerView;
        this.emptyView = emptyView;
        showEmptyViewIfNoData();
    }

    @Override
    public CategoryDetailRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryDetailRecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.app_item, parent, false));
    }

    @Override
    public void onBindViewHolder(CategoryDetailRecyclerViewHolder holder, int position) {
        holder.update(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void showEmptyViewIfNoData() {
        if (getItemCount() == 0) {
            if (recyclerView.getVisibility() == View.VISIBLE) {
                recyclerView.setVisibility(View.GONE);
            }
            if (emptyView.getVisibility() == View.GONE) {
                emptyView.setVisibility(View.VISIBLE);
            }
        } else {
            if (recyclerView.getVisibility() == View.GONE) {
                recyclerView.setVisibility(View.VISIBLE);
            }
            if (emptyView.getVisibility() == View.VISIBLE) {
                emptyView.setVisibility(View.GONE);
            }
        }
    }

    public void add(CategoryDetailResponse.Data d) {
        data.add(d);
        showEmptyViewIfNoData();
        notifyDataSetChanged();
    }

    public void addAll(List<CategoryDetailResponse.Data> ds) {
        data.addAll(ds);
        showEmptyViewIfNoData();
        notifyDataSetChanged();
    }

    public void addAll(CategoryDetailResponse.Data[] ds) {
        for (CategoryDetailResponse.Data d : ds) {
            data.add(d);
        }
        showEmptyViewIfNoData();
        notifyDataSetChanged();
    }

    public void clear() {
        data.clear();
        showEmptyViewIfNoData();
        notifyDataSetChanged();
    }


    public class CategoryDetailRecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView appNameTv;
        TextView appSizeTv;
        TextView appCommentTv;
        Button actionBtn;
        CategoryDetailResponse.Data data;
        Target<?> glideTarget = null;

        public CategoryDetailRecyclerViewHolder(final View itemView) {
            super(itemView);
            logo = (ImageView) itemView.findViewById(R.id.logo);
            appNameTv = (TextView) itemView.findViewById(R.id.appNameTv);
            appSizeTv = (TextView) itemView.findViewById(R.id.appSizeTv);
            appCommentTv = (TextView) itemView.findViewById(R.id.appCommentTv);
            actionBtn = (Button) itemView.findViewById(R.id.actionBtn);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        public void update(CategoryDetailResponse.Data d) {
            data = d;
            appNameTv.setText(d.getShorttitle());
            if (glideTarget != null) {
                Glide.clear(glideTarget);
            }
            glideTarget = Glide.with(frag)
                    .load(d.getLogo())
                    .skipMemoryCache(true)
                    .placeholder(R.drawable.ic_applogo_placeholder)
                    .dontAnimate()
                    .into(logo);

            appSizeTv.setText(d.getScore() + " points " + d.getApksize());
            appCommentTv.setText(d.getFollownum() + " followed " + d.getCommentnum() + " comments " + d.getDownCount() + "下载");
        }
    }
}
