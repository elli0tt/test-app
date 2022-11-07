package com.elli0tt.testapp.presentation.screen.sort.di

import androidx.lifecycle.ViewModel
import com.elli0tt.testapp.di.viewmodel.ViewModelKey
import com.elli0tt.testapp.presentation.screen.sort.SortViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(subcomponents = [SortComponent::class])
abstract class SortModule {

    @Binds
    @IntoMap
    @ViewModelKey(SortViewModel::class)
    abstract fun bindSortViewModel(viewModel: SortViewModel): ViewModel
}