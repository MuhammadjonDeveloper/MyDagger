package com.example.dugger2.component;

import android.content.Context;

import com.example.dugger2.MainActivity;
import com.example.dugger2.module.AdapterModule;
import com.example.dugger2.module.MainActivityMvpModule;
import com.example.dugger2.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(modules = {AdapterModule.class, MainActivityMvpModule.class})
public interface MainActivityComponent {
    Context getContext();

    void injectMainActivity(MainActivity mainActivity);
}
