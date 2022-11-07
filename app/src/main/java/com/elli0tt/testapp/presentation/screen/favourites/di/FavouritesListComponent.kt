package com.elli0tt.testapp.presentation.screen.favourites.di

import com.elli0tt.testapp.presentation.screen.favourites.FavouritesListFragment
import dagger.Subcomponent

@FavouritesListScope
@Subcomponent
interface FavouritesListComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): FavouritesListComponent
    }

    fun inject(fragment: FavouritesListFragment)
}
