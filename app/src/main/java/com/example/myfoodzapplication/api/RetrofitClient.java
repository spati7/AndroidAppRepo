package com.example.myfoodzapplication.api;

import android.util.Base64;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {


    private static final String BASE_URL = "https://mekvahan.com/api/";
    private static RetrofitClient myInstance;
    private Retrofit retrofit;


    private RetrofitClient() {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance() {
        if (myInstance == null) {
            myInstance = new RetrofitClient();
        }
        return myInstance;
    }

    public retrofitapi getApi() {
        return retrofit.create(retrofitapi.class);
    }
}