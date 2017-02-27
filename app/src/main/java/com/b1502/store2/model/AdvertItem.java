package com.b1502.store2.model;

import com.b1502.store2.util.UrlUtil;
import com.google.gson.annotations.SerializedName;

/**
 * 1. 广告model
 * 2. @author：liqingyi
 * 3. @date：2017/2/26 13:24
 */

public class AdvertItem {

    @SerializedName("Id")
    public String id;

    @SerializedName("ImgUrl")
    private String imgUrl;

    @SerializedName("LinkUrl")
    public String linkUrl;

    @SerializedName("ApplicationId")
    public String applicationId;

    @SerializedName("CreateDateTime")
    public String createDateTime;

    public String getImgUrl() {
        return UrlUtil.getImageUrl(imgUrl);
    }
}
