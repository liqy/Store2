package com.b1502.store2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.b1502.store2.R;
import com.b1502.store2.network.StoreParams;
import com.b1502.store2.util.UrlUtil;

import org.xutils.common.Callback;
import org.xutils.x;

/**
 * 分类列表页面
 * <p>
 * TabLayout
 */
public class CategoryActivity extends BaseActivity {

    public static void open(Activity activity) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initStoreBar("分类列表");
        getCategory("categoryId","b0066438-515e-4422-982a-ca203b35ea1c");
        getProducts("b0066438-515e-4422-982a-ca203b35ea1c",0);

    }

    public void getCategory(String param, String categoryId){
            StoreParams params = new StoreParams(UrlUtil.GetCategory,param,categoryId);
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

    public void getProducts(String productCategoryId, int startRowIndex) {
            StoreParams params = new StoreParams(UrlUtil.GetProducts, productCategoryId, startRowIndex);
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
