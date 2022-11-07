package com.elli0tt.testapp.presentation.screen.popular.di

import androidx.lifecycle.ViewModel
import com.elli0tt.testapp.di.viewmodel.ViewModelKey
import com.elli0tt.testapp.presentation.screen.popular.PopularListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(subcomponents = [PopularListComponent::class])
abstract class PopularListModule {

    @Binds
    @IntoMap
    @ViewModelKey(PopularListViewModel::class)
    abstract fun bindPopularListViewModel(viewModel: PopularListViewModel): ViewModel
}