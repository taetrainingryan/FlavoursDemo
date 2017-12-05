package com.example.ryan.flavoursdemo.network;

import com.example.ryan.flavoursdemo.network.RequestInterface;
import com.example.ryan.flavoursdemo.services.API_List;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ryan on 05/12/2017.
 */

public class ServerConnection {

    private static Retrofit retrofit;
    private static OkHttpClient okHttpClient;

    public static RequestInterface getServerConnection() {

        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(API_List.BASE_URL)
                .build();

        return retrofit.create(RequestInterface.class);

    }
}
