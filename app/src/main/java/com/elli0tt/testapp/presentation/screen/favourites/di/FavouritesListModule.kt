package com.elli0tt.testapp.presentation.screen.favourites.di

import androidx.lifecycle.ViewModel
import com.elli0tt.testapp.di.viewmodel.ViewModelKey
import com.elli0tt.testapp.presentation.screen.favourites.FavouritesListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(subcomponents = [FavouritesListComponent::class])
abstract class FavouritesListModule {

    @Binds
    @IntoMap
    @ViewModelKey(FavouritesListViewModel::class)
    abstract fun bindFavouritesListViewModel(viewModel: FavouritesListViewModel): ViewModel
}