package com.anggitprayogo.latihandagger2.di.Module;

import android.app.Activity;
import android.content.Context;

import com.anggitprayogo.latihandagger2.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Anggit on 06/01/2018.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
