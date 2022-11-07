package com.elli0tt.testapp.presentation.screen.main.di

import com.elli0tt.testapp.presentation.screen.main.MainActivity
import dagger.Subcomponent

@MainScope
@Subcomponent
interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): MainComponent
    }

    fun inject(activity: MainActivity)
}
