package com.practice.appdownloader.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gaofeng on 2017-01-23.
 */

public class CategoryResponse {
    private Data[] data;

    public Data[] getData() {
        return data;
    }

    public void setData(Data[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ClassPojo [data = " + data + "]";
    }


    public static class Data implements Parcelable {

        private String id;

        private String logo;

        private String title;

        private String keywords;

        private String dir;

        private String description;

        private String apkType;

        private String displayorder;

        private String[] tagList;

        private String entityType;

        private String rowscount;

        private String topid;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getApkType() {
            return apkType;
        }

        public void setApkType(String apkType) {
            this.apkType = apkType;
        }

        public String getDisplayorder() {
            return displayorder;
        }

        public void setDisplayorder(String displayorder) {
            this.displayorder = displayorder;
        }

        public String[] getTagList() {
            return tagList;
        }

        public void setTagList(String[] tagList) {
            this.tagList = tagList;
        }

        public String getEntityType() {
            return entityType;
        }

        public void setEntityType(String entityType) {
            this.entityType = entityType;
        }

        public String getRowscount() {
            return rowscount;
        }

        public void setRowscount(String rowscount) {
            this.rowscount = rowscount;
        }

        public String getTopid() {
            return topid;
        }

        public void setTopid(String topid) {
            this.topid = topid;
        }

        @Override
        public String toString() {
            return "ClassPojo [id = " + id + ", logo = " + logo + ", title = " + title + ", keywords = " + keywords + ", dir = " + dir + ", description = " + description + ", apkType = " + apkType + ", displayorder = " + displayorder + ", tagList = " + tagList + ", entityType = " + entityType + ", rowscount = " + rowscount + ", topid = " + topid + "]";
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.logo);
            dest.writeString(this.title);
            dest.writeString(this.keywords);
            dest.writeString(this.dir);
            dest.writeString(this.description);
            dest.writeString(this.apkType);
            dest.writeString(this.displayorder);
            dest.writeStringArray(this.tagList);
            dest.writeString(this.entityType);
            dest.writeString(this.rowscount);
            dest.writeString(this.topid);
        }

        public Data() {
        }

        protected Data(Parcel in) {
            this.id = in.readString();
            this.logo = in.readString();
            this.title = in.readString();
            this.keywords = in.readString();
            this.dir = in.readString();
            this.description = in.readString();
            this.apkType = in.readString();
            this.displayorder = in.readString();
            this.tagList = in.createStringArray();
            this.entityType = in.readString();
            this.rowscount = in.readString();
            this.topid = in.readString();
        }

        public static final Parcelable.Creator<Data> CREATOR = new Parcelable.Creator<Data>() {
            @Override
            public Data createFromParcel(Parcel source) {
                return new Data(source);
            }

            @Override
            public Data[] newArray(int size) {
                return new Data[size];
            }
        };
    }

}
