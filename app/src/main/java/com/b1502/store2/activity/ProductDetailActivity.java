package com.b1502.store2.activity;

import android.os.Bundle;
import android.util.Log;

import com.b1502.store2.R;
import com.b1502.store2.network.StoreParams;
import com.b1502.store2.util.UrlUtil;

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
        getProduct("productId","205338e7-33de-46aa-ad79-4ac56dfdc9ef");
    }

    private void getProduct(String param, String productId) {
        StoreParams params = new StoreParams(UrlUtil.GetProduct,param,productId);
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
}
