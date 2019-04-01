package com.example.dugger2.module;

import android.content.Context;

import com.example.dugger2.qualifier.ApplicationContext;
import com.example.dugger2.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ApplicationScope
    @ApplicationContext
    public Context provideContext() {
        return context;
    }
}
