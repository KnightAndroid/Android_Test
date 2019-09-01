package com.example.first_native.app;

import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication app;

    public static MyApplication getInstance() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

      //   FlutterMain.startInitialization(getApplicationContext());
      //   FlutterMain.ensureInitializationComplete(getApplicationContext(),null);
    }
}
