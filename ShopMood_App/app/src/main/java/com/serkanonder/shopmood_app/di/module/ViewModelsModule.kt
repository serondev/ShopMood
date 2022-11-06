package com.serkanonder.shopmood_app.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.serkanonder.shopmood_app.di.ViewModelKey
import com.serkanonder.shopmood_app.di.ViewModelProviderFactory
import com.serkanonder.shopmood_app.presentation.products.viewmodel.ProductsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule {
    @Module
    abstract class ViewModelsModule {

        @Binds
        abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory?): ViewModelProvider.Factory?
    } // ViewModelKey ile hangi viewmodel için hangi provider kullanılacağını belirtiyoruz.

    @Binds
    @IntoMap
    @ViewModelKey(ProductsViewModel::class)
    abstract fun bindProductsViewModel(viewModel: ProductsViewModel): ViewModel? // ProductsViewModel için ProductsViewModelProvider kullanılacak.
}