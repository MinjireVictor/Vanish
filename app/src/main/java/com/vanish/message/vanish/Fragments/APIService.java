package com.vanish.message.vanish.Fragments;

import com.vanish.message.vanish.Notifications.MyResponse;
import com.vanish.message.vanish.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAFaQZisY:APA91bHkVAvTToaY1q6chhnoQvs3F8hRsq6CF6jWd4CvujrPdB2e-FJEokNrIgX-RWxiuNTrpIyv1v-2WvzcxPiC9DhFnCUwnBuBSVm3SPjEsbUcvn4R3mtRJb7gUU-QjGIHr-yJGYLy"

            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
