package com.elli0tt.testapp.presentation.screen.popular.di

import com.elli0tt.testapp.presentation.screen.popular.PopularListFragment
import dagger.Subcomponent

@PopularListScope
@Subcomponent
interface PopularListComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): PopularListComponent
    }

    fun inject(fragment: PopularListFragment)
}