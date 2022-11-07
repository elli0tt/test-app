package com.elli0tt.testapp.presentation.screen.popular.di

import androidx.lifecycle.ViewModel
import com.elli0tt.testapp.di.viewmodel.ViewModelKey
import com.elli0tt.testapp.presentation.screen.popular.PopularViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(subcomponents = [PopularComponent::class])
abstract class PopularModule {

    @Binds
    @IntoMap
    @ViewModelKey(PopularViewModel::class)
    abstract fun bindPopularViewModel(viewModel: PopularViewModel): ViewModel
}