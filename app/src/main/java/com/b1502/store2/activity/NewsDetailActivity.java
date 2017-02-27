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
 * 资讯详情页面
 */
public class NewsDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        getNews("newsId","648cf203-16f0-4603-b291-40864c472356");
    }

    private void getNews(String param, String newsId) {
        StoreParams params = new StoreParams(UrlUtil.GetNews,param,newsId);
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
