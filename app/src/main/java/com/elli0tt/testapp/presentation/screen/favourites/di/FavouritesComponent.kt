package com.elli0tt.testapp.presentation.screen.favourites.di

import com.elli0tt.testapp.presentation.screen.favourites.FavouritesFragment
import dagger.Subcomponent

@FavouritesScope
@Subcomponent
interface FavouritesComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): FavouritesComponent
    }

    fun inject(fragment: FavouritesFragment)
}
