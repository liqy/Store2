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
 * 订单确认页面
 */
public class ConfirmOrderActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);
        getOrder("orderId","706651fc-7d52-406e-a752-0d4f2b6f06c1");
        getAccount();
        confirmOrder("706651fc-7d52-406e-a752-0d4f2b6f06c1","","");

        String[] productIds = {"157fbb6d-750d-41ec-b8da-047a7f96ca4b"};
        removeItems(productIds);
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

    /**
     * 获取账户余额
     */
    public void getAccount() {
        StoreParams params = new StoreParams(UrlUtil.GetAccount);
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
     * 确认订单
     * @param orderId 订单ID
     * @param remark
     * @param invoice
     */
    public void confirmOrder(String orderId, String remark, String invoice) {
        StoreParams params = new StoreParams(UrlUtil.ConfirmOrder);
        params.setAsJsonContent(true);
        PostParams postParams = new PostParams(orderId, remark,invoice);
        params.setBodyContent(new Gson().toJson(postParams));

        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onSuccess(String result) {
                //TODO 支付页面
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
     * 移除购物车
     * @param productIds 产品ID集合
     */
    public void removeItems(String[] productIds) {
        StoreParams params = new StoreParams(UrlUtil.RemoveItems);
        params.setAsJsonContent(true);
        PostParams postParams = new PostParams(productIds);
        params.setBodyContent(new Gson().toJson(postParams));

        x.http().post(params, new Callback.CommonCallback<String>() {
            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onSuccess(String result) {
                // TODO 更新购物车数量
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
