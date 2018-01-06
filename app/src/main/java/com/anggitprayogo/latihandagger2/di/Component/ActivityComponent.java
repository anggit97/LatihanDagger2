package com.anggitprayogo.latihandagger2.di.Component;

import com.anggitprayogo.latihandagger2.MainActivity;
import com.anggitprayogo.latihandagger2.di.Module.ActivityModule;
import com.anggitprayogo.latihandagger2.di.PerActivity;

import dagger.Component;

/**
 * Created by Anggit on 06/01/2018.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}