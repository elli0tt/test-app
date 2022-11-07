package com.elli0tt.testapp.presentation.screen.popular.di

import com.elli0tt.testapp.presentation.screen.popular.PopularFragment
import dagger.Subcomponent

@PopularScope
@Subcomponent
interface PopularComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): PopularComponent
    }

    fun inject(fragment: PopularFragment)
}