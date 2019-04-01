package com.example.dugger2.module;

import android.content.Context;

import com.example.dugger2.MainActivity;
import com.example.dugger2.qualifier.ActivityContext;
import com.example.dugger2.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivitContextyModule {

    public Context context;
    private MainActivity mainActivity;

    public MainActivitContextyModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        context = mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public MainActivity providesMainActivity() {
        return mainActivity;
    }

    public Context provideConext() {
        return context;
    }
}
