package com.example.dugger2.retrofit;

import com.example.dugger2.pojo.CryptoData;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface APIInterface {
    @GET("ticker/?")
    Observable<List<CryptoData>> getData(@Query("limit") String limit);
}
