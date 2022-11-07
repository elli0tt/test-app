package com.elli0tt.testapp.presentation.screen.sort.di

import androidx.fragment.app.Fragment
import dagger.Subcomponent

@SortSettingsScope
@Subcomponent
interface SortSettingsComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): SortSettingsComponent
    }

    fun inject(fragment: Fragment)
}