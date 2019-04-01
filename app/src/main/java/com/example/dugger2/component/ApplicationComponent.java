package com.example.dugger2.component;

import android.content.Context;

import com.example.dugger2.MyApplication;
import com.example.dugger2.module.ContextModule;
import com.example.dugger2.module.RetrofitModule;
import com.example.dugger2.retrofit.APIInterface;
import com.example.dugger2.scope.ApplicationScope;

import dagger.Component;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {
    APIInterface getApiInterface();

    Context getContext();

    void injectApplication(MyApplication myApplication);
}
