package com.elli0tt.testapp.presentation.screen.main.di

import androidx.lifecycle.ViewModel
import com.elli0tt.testapp.di.viewmodel.ViewModelKey
import com.elli0tt.testapp.presentation.screen.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainComponent::class])
abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}