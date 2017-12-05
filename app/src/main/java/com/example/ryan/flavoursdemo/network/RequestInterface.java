package com.example.ryan.flavoursdemo.network;

import com.example.ryan.flavoursdemo.network.model.CharactersModel;
import com.example.ryan.flavoursdemo.services.API_List;

import java.util.concurrent.ConcurrentHashMap;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Ryan on 05/12/2017.
 */

public interface RequestInterface {

    @GET(API_List.BASE_URL)
    Observable<CharactersModel>getCharactersModel();

}
