package com.elli0tt.testapp.presentation.screen.sort.di

import androidx.lifecycle.ViewModel
import com.elli0tt.testapp.di.viewmodel.ViewModelKey
import com.elli0tt.testapp.presentation.screen.sort.SortSettingsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(subcomponents = [SortSettingsComponent::class])
abstract class SortSettingsModule {

    @Binds
    @IntoMap
    @ViewModelKey(SortSettingsViewModel::class)
    abstract fun bindSortSettingsViewModel(viewModel: SortSettingsViewModel): ViewModel
}