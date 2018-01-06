package com.anggitprayogo.latihandagger2.di.Component;

import android.app.Application;
import android.content.Context;

import com.anggitprayogo.latihandagger2.DemoApplication;
import com.anggitprayogo.latihandagger2.data.DataManager;
import com.anggitprayogo.latihandagger2.data.DbHelper;
import com.anggitprayogo.latihandagger2.data.SharedPrefHelper;
import com.anggitprayogo.latihandagger2.di.ApplicationContext;
import com.anggitprayogo.latihandagger2.di.Module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Anggit on 06/01/2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefHelper getPreferenceHelper();

    DbHelper getDbHelper();

}

