package com.b1502.store2.activity;

import android.os.Bundle;
import android.util.Log;

import com.b1502.store2.R;
import com.b1502.store2.network.PostParams;
import com.b1502.store2.network.StoreParams;
import com.b1502.store2.util.UrlUtil;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.x;

/**
 * 产品详情页面
 */
public class ProductDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        getProduct("productId", "e4b77948-00b3-48e5-b8ab-6cc943d0f276");
        addItem(1,"e4b77948-00b3-48e5-b8ab-6cc943d0f276");
    }

    private void getProduct(String param, String productId) {
        StoreParams params = new StoreParams(UrlUtil.GetProduct, param, productId);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onSuccess(String result) {
                Log.d(TAG, result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * 添加到购物车
     * @param count 购买商品数量
     * @param productId 购买商品ID
     */
    private void addItem(int count, String productId) {
        StoreParams params = new StoreParams(UrlUtil.AddItem);
        params.setAsJsonContent(true);
        PostParams postParams = new PostParams(count, productId);
        params.setBodyContent(new Gson().toJson(postParams));

        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onSuccess(String result) {
                Log.d(TAG, result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
