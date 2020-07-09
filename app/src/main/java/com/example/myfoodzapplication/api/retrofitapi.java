package com.example.myfoodzapplication.api;

import com.example.myfoodzapplication.model.LoginResponse;
import com.example.myfoodzapplication.model.User;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface retrofitapi {

    @POST("android_intern_task")
    Call<LoginResponse> userLogin(@Body User user);
}
