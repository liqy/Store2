package com.b1502.store2.util;

import com.b1502.store2.Config;

/**
 * 1. 类的用途
 * 2. @author：liqingyi
 * 3. @date：2017/2/26 13:30
 */

public class UrlUtil {

    /**
     * 获取图片地址
     *
     * @param url
     * @return
     */
    public static String getImageUrl(String url) {
        return String.format("%1$s%2$s?application-token=%3$s&storeId=%4$s",
                Config.IMAGE_URL,
                url,
                Config.APP_TOKEN,
                Config.STORE_ID);
    }

    /**
     * 获取URL
     *
     * @param url
     * @return
     */
    public static String getAPIUrl(String url) {
        return String.format("%1$s%2$s?storeId=%3$s", Config.API_URL, url, Config.STORE_ID);
    }

    /**
     *
     * @param url
     * @param params "newsId"
     * @param newsId "648cf203-16f0-4603-b291-40864c472356"
     * @return
     */
    public static String getAPIUrl(String url, String params, String newsId) {
        return String.format("%1$s%2$s?storeId=%3$s&%4$s=%5$s", Config.API_URL, url, Config.STORE_ID, params, newsId);
    }

    public static String getAPIUrl(String url, String params, String newsId,int startRowIndex) {
        return String.format("%1$s%2$s?storeId=%3$s&%4$s=%5$s", Config.API_URL, url, Config.STORE_ID, params, newsId);
    }

    /**
     * 分页
     *
     * @param url
     * @param pageIndex
     * @return
     */
    public static String getAPIUrl(String url, int pageIndex) {
        return String.format("%1$s%2$s?storeId=%3$s&pageIndex=%4$s", Config.API_URL, url, Config.STORE_ID, pageIndex);
    }

    //首页广告轮播图
    public static final String GetAdvertItems = "/Site/Home/GetAdvertItems";

    //首页产品列表
    public static final String GetHomeProducts = "/Site/Home/GetHomeProducts";

    //产品信息
    public static final String GetProduct = "/Shop/Product/GetProduct";

    //产品详情
    public static final String GetProductIntroduce = "/Shop/Product/GetProductIntroduce";

    //加入购物车 POST
    public static final String AddItem = "/Shop/ShoppingCart/AddItem";

    //结算 ：创建订单 POST
    public static final String CreateOrder = "/Shop/Order/CreateOrder";

    //获取订单
    public static final String GetOrder = "/Shop/Order/GetOrder";

    //获取账户余额
    public static final String GetAccount = "/Account/Account/GetAccount";

    //确认订单 POST
    public static final String ConfirmOrder = "/Shop/Order/ConfirmOrder";

    //移除购物车 POST
    public static final String RemoveItems = "/Shop/ShoppingCart/RemoveItems";

    //分类列表
    public static final String GetCategories = "/Shop/Product/GetCategories";

    //分类信息
    public static final String GetCategory = "/Shop/Product/GetCategory";
    public static final String GetProducts = "/Shop/Product/GetProducts";

    //购物车
    public static final String GetItems = "/Shop/ShoppingCart/GetItems";

    //微资讯
    public static final String GetNewsList = "/Site/Info/GetNewsList";

    //资讯详情
    public static final String GetNews = "/Site/Info/GetNews";


}
