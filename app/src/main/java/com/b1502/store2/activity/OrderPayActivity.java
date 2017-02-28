package com.b1502.store2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.b1502.store2.R;
import com.b1502.store2.network.StoreParams;
import com.b1502.store2.util.UrlUtil;

import org.xutils.common.Callback;
import org.xutils.x;

/**
 * 订单支付
 */
public class OrderPayActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_pay);
        getOrder("orderId","706651fc-7d52-406e-a752-0d4f2b6f06c1");
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
