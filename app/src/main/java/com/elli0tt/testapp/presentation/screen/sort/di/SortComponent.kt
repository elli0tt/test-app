package com.elli0tt.testapp.presentation.screen.sort.di

import androidx.fragment.app.Fragment
import dagger.Subcomponent

@SortScope
@Subcomponent
interface SortComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): SortComponent
    }

    fun inject(fragment: Fragment)
}