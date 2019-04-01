package com.example.dugger2.module;

import com.example.dugger2.mvp.MainctivityContract;

import dagger.Module;

@Module
public class MainActivityMvpModule {
    private final MainctivityContract.View mView;

    public MainActivityMvpModule(MainctivityContract.View mView) {
        this.mView = mView;
    }

    MainctivityContract.View provideView() {
        return mView;
    }
}
