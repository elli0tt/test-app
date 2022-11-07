package com.elli0tt.testapp

import android.app.Application
import com.elli0tt.testapp.di.AppComponent
import com.elli0tt.testapp.di.DaggerAppComponent

class App: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppComponent()
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent.factory()
            .create(applicationContext)
    }
}