package com.example.appupdate;

import android.app.Application;

import com.qiangxi.checkupdatelibrary.Q;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Q.debug("tag", true);
    }
}
