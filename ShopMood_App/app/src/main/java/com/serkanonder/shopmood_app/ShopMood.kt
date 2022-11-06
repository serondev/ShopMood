package com.serkanonder.shopmood_app

import android.app.Application
import com.serkanonder.shopmood_app.di.component.AppComponent
import com.serkanonder.shopmood_app.di.component.DaggerAppComponent
import timber.log.Timber

class ShopMood : Application() {

    private val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        provideAppComponent().inject(this)
        Timber.plant(Timber.DebugTree())
    }

    fun provideAppComponent() = appComponent
}