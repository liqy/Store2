package com.b1502.store2.model;

import com.b1502.store2.util.UrlUtil;
import com.google.gson.annotations.SerializedName;

/**
 * 1. 产品信息
 * 2. @author：liqingyi
 * 3. @date：2017/2/27 14:25
 */

public class Product {

    @SerializedName("Id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("Price")
    public int price;

    @SerializedName("CreateDateTime")
    public String createDateTime;

    @SerializedName("Unit")
    public String unit;

    @SerializedName("ProductId")
    public String productId;

    @SerializedName("ImagePath")
    private String imagePath;

    @SerializedName("MemberPrice")
    public int memberPrice;

    @SerializedName("ApplicationId")
    public String applicationId;

    @SerializedName("PromotionLabel")
    public String promotionLabel;

    public String getImagePath() {
        return UrlUtil.getImageUrl(imagePath);
    }
}
