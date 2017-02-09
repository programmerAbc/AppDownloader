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
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.practice.appdownloader.model.CategoryDetailResponse;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gaofeng on 2017-01-23.
 */

public class CategoryDetailRecyclerViewAdapter extends RecyclerView.Adapter<CategoryDetailRecyclerViewAdapter.CategoryDetailRecyclerViewHolder> {
    LinkedList<CategoryDetailResponse.Data> data = new LinkedList<>();
    Fragment frag;

    public CategoryDetailRecyclerViewAdapter(Fragment frag) {
        this.frag = frag;
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

    public void add(CategoryDetailResponse.Data d) {
        data.add(d);
        notifyDataSetChanged();
    }

    public void addAll(List<CategoryDetailResponse.Data> ds) {
        data.addAll(ds);
        notifyDataSetChanged();
    }

    public void addAll(CategoryDetailResponse.Data[] ds) {
        for (CategoryDetailResponse.Data d : ds) {
            data.add(d);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        data.clear();
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
