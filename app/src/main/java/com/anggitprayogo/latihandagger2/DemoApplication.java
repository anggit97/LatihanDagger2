package com.anggitprayogo.latihandagger2;

import android.app.Application;
import android.content.Context;

import com.anggitprayogo.latihandagger2.data.DataManager;
import com.anggitprayogo.latihandagger2.di.Component.ApplicationComponent;
import com.anggitprayogo.latihandagger2.di.Component.DaggerApplicationComponent;
import com.anggitprayogo.latihandagger2.di.Module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Anggit on 06/01/2018.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
