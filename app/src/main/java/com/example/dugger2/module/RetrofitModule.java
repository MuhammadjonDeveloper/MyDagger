package com.example.dugger2.module;

import com.example.dugger2.retrofit.APIInterface;
import com.example.dugger2.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class RetrofitModule {
    @Provides
    @ApplicationScope
    APIInterface getApiInterface(Retrofit retrofit) {
        return retrofit.create(APIInterface.class);
    }
}
