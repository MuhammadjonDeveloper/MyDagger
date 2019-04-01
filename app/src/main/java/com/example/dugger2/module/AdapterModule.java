package com.example.dugger2.module;

import android.support.v7.widget.RecyclerView;

import com.example.dugger2.RecyclerViewAdapter;

import dagger.Module;

@Module(includes = {MainActivitContextyModule.class})
public class AdapterModule {
    public RecyclerViewAdapter adapter;
}
