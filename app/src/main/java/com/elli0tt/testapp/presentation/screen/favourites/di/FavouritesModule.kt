package com.elli0tt.testapp.presentation.screen.favourites.di

import androidx.lifecycle.ViewModel
import com.elli0tt.testapp.di.viewmodel.ViewModelKey
import com.elli0tt.testapp.presentation.screen.favourites.FavouritesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(subcomponents = [FavouritesComponent::class])
abstract class FavouritesModule {

    @Binds
    @IntoMap
    @ViewModelKey(FavouritesViewModel::class)
    abstract fun bindFavouriteViewModel(viewModel: FavouritesViewModel): ViewModel
}