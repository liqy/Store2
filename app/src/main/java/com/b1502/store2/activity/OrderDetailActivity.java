package com.b1502.store2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.b1502.store2.R;
import com.b1502.store2.network.StoreParams;
import com.b1502.store2.util.UrlUtil;

import org.xutils.common.Callback;
import org.xutils.x;

public class OrderDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        getOrder("orderId","826bd4e0-1696-48d5-a7b2-7c0c43b586fb");
    }

    /**
     * 获取订单
     */
    public void getOrder(String param, String orderId) {
        StoreParams params = new StoreParams(UrlUtil.GetOrder, param, orderId);
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
