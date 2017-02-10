package com.practice.appdownloader.http;

import com.practice.appdownloader.model.CategoryDetailResponse;
import com.practice.appdownloader.model.CategoryResponse;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by gaofeng on 2017-02-07.
 */

public interface RetrofitService {
    @Headers({
            "X-Requested-With: XMLHttpRequest",
            "X-Sdk-Int: 23",
            "X-Sdk-Locale: en-US",
            "X-App-Id: coolmarket",
            "X-App-Token: d2163527f55c19e9546b2e144bfbdd05ca62bcda-c62e-39f3-9f52-e1ee5e1e01c90x589d156e",
            "X-App-Version: 7.3",
            "X-App-Code: 1701135",
            "X-Api-Version: 7"
    })
    @GET("v6/apk/categorylist?apkType=0")
    Observable<CategoryResponse> getAppCategory();

    @Headers({
            "X-Requested-With: XMLHttpRequest",
            "X-Sdk-Int: 23",
            "X-Sdk-Locale: en-US",
            "X-App-Id: coolmarket",
            "X-App-Token: d2163527f55c19e9546b2e144bfbdd05ca62bcda-c62e-39f3-9f52-e1ee5e1e01c90x589d156e",
            "X-App-Version: 7.3",
            "X-App-Code: 1701135",
            "X-Api-Version: 7"
    })
    @GET
    Observable<CategoryDetailResponse> getAppCategoryDetail(@Url String url);
}
