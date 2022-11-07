package com.elli0tt.testapp.di

import androidx.lifecycle.ViewModelProvider
import com.elli0tt.testapp.di.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}