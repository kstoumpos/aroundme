package com.stoumpos.aroundme2.Utils.utils;

import com.stoumpos.aroundme2.R;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitService {

    //@Headers({"Content-Type: application/json", "Authorization: "+ BuildConfig.FCM_KEY})
    @Headers({"Content-Type: application/json", "Authorization: "+ R.string.FCM_KEY})
    @POST("send")
    Call<Object> sendPushNotification(@Body PushNotificationObject data);
}
