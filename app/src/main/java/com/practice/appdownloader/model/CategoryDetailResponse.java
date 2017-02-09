package com.practice.appdownloader.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gaofeng on 2017-02-09.
 */

public class CategoryDetailResponse {
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
        private String extraFlag;

        private String hotlabel;

        private String packageName;

        private String downCount;

        private String ishp;

        private String votenum;

        private String adminscore;

        private String score;

        private String followCount;

        private String downnum;

        private String entityType;

        private String romversion;

        private String commentnum;

        private String lastupdate;

        private String description;

        private String catid;

        private String keywords;

        private String pubStatusText;

        private String status;

        private String pubdate;

        private String url;

        private String shortTags;

        private String apkRomVersion;

        private String apktype;

        private String ishot;

        private String apkmd5;

        private String apkTypeName;

        private String developername;

        private String apkUrl;

        private String statusText;

        private String digest;

        private String follownum;

        private String voteCount;

        private String recommend;

        private String version;

        private String id;

        private String apkTypeUrl;

        private String title;

        private String isbiz;

        private String developeruid;

        private String favnum;

        private String replynum;

        private String sdkversion;

        private String shorttitle;

        private String apkversionname;

        private String apkname;

        private String catDir;

        private String logo;

        private String star;

        private String iscps;

        private String commentCount;

        private String shortlabel;

        private String catName;

        private String apkname2;

        private String apklength;

        private String updateFlag;

        private String apksize;

        private String apkversioncode;

        public String getExtraFlag() {
            return extraFlag;
        }

        public void setExtraFlag(String extraFlag) {
            this.extraFlag = extraFlag;
        }

        public String getHotlabel() {
            return hotlabel;
        }

        public void setHotlabel(String hotlabel) {
            this.hotlabel = hotlabel;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public String getDownCount() {
            return downCount;
        }

        public void setDownCount(String downCount) {
            this.downCount = downCount;
        }

        public String getIshp() {
            return ishp;
        }

        public void setIshp(String ishp) {
            this.ishp = ishp;
        }

        public String getVotenum() {
            return votenum;
        }

        public void setVotenum(String votenum) {
            this.votenum = votenum;
        }

        public String getAdminscore() {
            return adminscore;
        }

        public void setAdminscore(String adminscore) {
            this.adminscore = adminscore;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getFollowCount() {
            return followCount;
        }

        public void setFollowCount(String followCount) {
            this.followCount = followCount;
        }

        public String getDownnum() {
            return downnum;
        }

        public void setDownnum(String downnum) {
            this.downnum = downnum;
        }

        public String getEntityType() {
            return entityType;
        }

        public void setEntityType(String entityType) {
            this.entityType = entityType;
        }

        public String getRomversion() {
            return romversion;
        }

        public void setRomversion(String romversion) {
            this.romversion = romversion;
        }

        public String getCommentnum() {
            return commentnum;
        }

        public void setCommentnum(String commentnum) {
            this.commentnum = commentnum;
        }

        public String getLastupdate() {
            return lastupdate;
        }

        public void setLastupdate(String lastupdate) {
            this.lastupdate = lastupdate;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCatid() {
            return catid;
        }

        public void setCatid(String catid) {
            this.catid = catid;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getPubStatusText() {
            return pubStatusText;
        }

        public void setPubStatusText(String pubStatusText) {
            this.pubStatusText = pubStatusText;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getShortTags() {
            return shortTags;
        }

        public void setShortTags(String shortTags) {
            this.shortTags = shortTags;
        }

        public String getApkRomVersion() {
            return apkRomVersion;
        }

        public void setApkRomVersion(String apkRomVersion) {
            this.apkRomVersion = apkRomVersion;
        }

        public String getApktype() {
            return apktype;
        }

        public void setApktype(String apktype) {
            this.apktype = apktype;
        }

        public String getIshot() {
            return ishot;
        }

        public void setIshot(String ishot) {
            this.ishot = ishot;
        }

        public String getApkmd5() {
            return apkmd5;
        }

        public void setApkmd5(String apkmd5) {
            this.apkmd5 = apkmd5;
        }

        public String getApkTypeName() {
            return apkTypeName;
        }

        public void setApkTypeName(String apkTypeName) {
            this.apkTypeName = apkTypeName;
        }

        public String getDevelopername() {
            return developername;
        }

        public void setDevelopername(String developername) {
            this.developername = developername;
        }

        public String getApkUrl() {
            return apkUrl;
        }

        public void setApkUrl(String apkUrl) {
            this.apkUrl = apkUrl;
        }

        public String getStatusText() {
            return statusText;
        }

        public void setStatusText(String statusText) {
            this.statusText = statusText;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getFollownum() {
            return follownum;
        }

        public void setFollownum(String follownum) {
            this.follownum = follownum;
        }

        public String getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(String voteCount) {
            this.voteCount = voteCount;
        }

        public String getRecommend() {
            return recommend;
        }

        public void setRecommend(String recommend) {
            this.recommend = recommend;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getApkTypeUrl() {
            return apkTypeUrl;
        }

        public void setApkTypeUrl(String apkTypeUrl) {
            this.apkTypeUrl = apkTypeUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getIsbiz() {
            return isbiz;
        }

        public void setIsbiz(String isbiz) {
            this.isbiz = isbiz;
        }

        public String getDeveloperuid() {
            return developeruid;
        }

        public void setDeveloperuid(String developeruid) {
            this.developeruid = developeruid;
        }

        public String getFavnum() {
            return favnum;
        }

        public void setFavnum(String favnum) {
            this.favnum = favnum;
        }

        public String getReplynum() {
            return replynum;
        }

        public void setReplynum(String replynum) {
            this.replynum = replynum;
        }

        public String getSdkversion() {
            return sdkversion;
        }

        public void setSdkversion(String sdkversion) {
            this.sdkversion = sdkversion;
        }

        public String getShorttitle() {
            return shorttitle;
        }

        public void setShorttitle(String shorttitle) {
            this.shorttitle = shorttitle;
        }

        public String getApkversionname() {
            return apkversionname;
        }

        public void setApkversionname(String apkversionname) {
            this.apkversionname = apkversionname;
        }

        public String getApkname() {
            return apkname;
        }

        public void setApkname(String apkname) {
            this.apkname = apkname;
        }

        public String getCatDir() {
            return catDir;
        }

        public void setCatDir(String catDir) {
            this.catDir = catDir;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getStar() {
            return star;
        }

        public void setStar(String star) {
            this.star = star;
        }

        public String getIscps() {
            return iscps;
        }

        public void setIscps(String iscps) {
            this.iscps = iscps;
        }

        public String getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(String commentCount) {
            this.commentCount = commentCount;
        }

        public String getShortlabel() {
            return shortlabel;
        }

        public void setShortlabel(String shortlabel) {
            this.shortlabel = shortlabel;
        }

        public String getCatName() {
            return catName;
        }

        public void setCatName(String catName) {
            this.catName = catName;
        }

        public String getApkname2() {
            return apkname2;
        }

        public void setApkname2(String apkname2) {
            this.apkname2 = apkname2;
        }

        public String getApklength() {
            return apklength;
        }

        public void setApklength(String apklength) {
            this.apklength = apklength;
        }

        public String getUpdateFlag() {
            return updateFlag;
        }

        public void setUpdateFlag(String updateFlag) {
            this.updateFlag = updateFlag;
        }

        public String getApksize() {
            return apksize;
        }

        public void setApksize(String apksize) {
            this.apksize = apksize;
        }

        public String getApkversioncode() {
            return apkversioncode;
        }

        public void setApkversioncode(String apkversioncode) {
            this.apkversioncode = apkversioncode;
        }

        @Override
        public String toString() {
            return "ClassPojo [extraFlag = " + extraFlag + ", hotlabel = " + hotlabel + ", packageName = " + packageName + ", downCount = " + downCount + ", ishp = " + ishp + ", votenum = " + votenum + ", adminscore = " + adminscore + ", score = " + score + ", followCount = " + followCount + ", downnum = " + downnum + ", entityType = " + entityType + ", romversion = " + romversion + ", commentnum = " + commentnum + ", lastupdate = " + lastupdate + ", description = " + description + ", catid = " + catid + ", keywords = " + keywords + ", pubStatusText = " + pubStatusText + ", status = " + status + ", pubdate = " + pubdate + ", url = " + url + ", shortTags = " + shortTags + ", apkRomVersion = " + apkRomVersion + ", apktype = " + apktype + ", ishot = " + ishot + ", apkmd5 = " + apkmd5 + ", apkTypeName = " + apkTypeName + ", developername = " + developername + ", apkUrl = " + apkUrl + ", statusText = " + statusText + ", digest = " + digest + ", follownum = " + follownum + ", voteCount = " + voteCount + ", recommend = " + recommend + ", version = " + version + ", id = " + id + ", apkTypeUrl = " + apkTypeUrl + ", title = " + title + ", isbiz = " + isbiz + ", developeruid = " + developeruid + ", favnum = " + favnum + ", replynum = " + replynum + ", sdkversion = " + sdkversion + ", shorttitle = " + shorttitle + ", apkversionname = " + apkversionname + ", apkname = " + apkname + ", catDir = " + catDir + ", logo = " + logo + ", star = " + star + ", iscps = " + iscps + ", commentCount = " + commentCount + ", shortlabel = " + shortlabel + ", catName = " + catName + ", apkname2 = " + apkname2 + ", apklength = " + apklength + ", updateFlag = " + updateFlag + ", apksize = " + apksize + ", apkversioncode = " + apkversioncode + "]";
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.extraFlag);
            dest.writeString(this.hotlabel);
            dest.writeString(this.packageName);
            dest.writeString(this.downCount);
            dest.writeString(this.ishp);
            dest.writeString(this.votenum);
            dest.writeString(this.adminscore);
            dest.writeString(this.score);
            dest.writeString(this.followCount);
            dest.writeString(this.downnum);
            dest.writeString(this.entityType);
            dest.writeString(this.romversion);
            dest.writeString(this.commentnum);
            dest.writeString(this.lastupdate);
            dest.writeString(this.description);
            dest.writeString(this.catid);
            dest.writeString(this.keywords);
            dest.writeString(this.pubStatusText);
            dest.writeString(this.status);
            dest.writeString(this.pubdate);
            dest.writeString(this.url);
            dest.writeString(this.shortTags);
            dest.writeString(this.apkRomVersion);
            dest.writeString(this.apktype);
            dest.writeString(this.ishot);
            dest.writeString(this.apkmd5);
            dest.writeString(this.apkTypeName);
            dest.writeString(this.developername);
            dest.writeString(this.apkUrl);
            dest.writeString(this.statusText);
            dest.writeString(this.digest);
            dest.writeString(this.follownum);
            dest.writeString(this.voteCount);
            dest.writeString(this.recommend);
            dest.writeString(this.version);
            dest.writeString(this.id);
            dest.writeString(this.apkTypeUrl);
            dest.writeString(this.title);
            dest.writeString(this.isbiz);
            dest.writeString(this.developeruid);
            dest.writeString(this.favnum);
            dest.writeString(this.replynum);
            dest.writeString(this.sdkversion);
            dest.writeString(this.shorttitle);
            dest.writeString(this.apkversionname);
            dest.writeString(this.apkname);
            dest.writeString(this.catDir);
            dest.writeString(this.logo);
            dest.writeString(this.star);
            dest.writeString(this.iscps);
            dest.writeString(this.commentCount);
            dest.writeString(this.shortlabel);
            dest.writeString(this.catName);
            dest.writeString(this.apkname2);
            dest.writeString(this.apklength);
            dest.writeString(this.updateFlag);
            dest.writeString(this.apksize);
            dest.writeString(this.apkversioncode);
        }

        public Data() {
        }

        protected Data(Parcel in) {
            this.extraFlag = in.readString();
            this.hotlabel = in.readString();
            this.packageName = in.readString();
            this.downCount = in.readString();
            this.ishp = in.readString();
            this.votenum = in.readString();
            this.adminscore = in.readString();
            this.score = in.readString();
            this.followCount = in.readString();
            this.downnum = in.readString();
            this.entityType = in.readString();
            this.romversion = in.readString();
            this.commentnum = in.readString();
            this.lastupdate = in.readString();
            this.description = in.readString();
            this.catid = in.readString();
            this.keywords = in.readString();
            this.pubStatusText = in.readString();
            this.status = in.readString();
            this.pubdate = in.readString();
            this.url = in.readString();
            this.shortTags = in.readString();
            this.apkRomVersion = in.readString();
            this.apktype = in.readString();
            this.ishot = in.readString();
            this.apkmd5 = in.readString();
            this.apkTypeName = in.readString();
            this.developername = in.readString();
            this.apkUrl = in.readString();
            this.statusText = in.readString();
            this.digest = in.readString();
            this.follownum = in.readString();
            this.voteCount = in.readString();
            this.recommend = in.readString();
            this.version = in.readString();
            this.id = in.readString();
            this.apkTypeUrl = in.readString();
            this.title = in.readString();
            this.isbiz = in.readString();
            this.developeruid = in.readString();
            this.favnum = in.readString();
            this.replynum = in.readString();
            this.sdkversion = in.readString();
            this.shorttitle = in.readString();
            this.apkversionname = in.readString();
            this.apkname = in.readString();
            this.catDir = in.readString();
            this.logo = in.readString();
            this.star = in.readString();
            this.iscps = in.readString();
            this.commentCount = in.readString();
            this.shortlabel = in.readString();
            this.catName = in.readString();
            this.apkname2 = in.readString();
            this.apklength = in.readString();
            this.updateFlag = in.readString();
            this.apksize = in.readString();
            this.apkversioncode = in.readString();
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
