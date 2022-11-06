package com.serkanonder.shopmood_app.di.module

import com.serkanonder.shopmood_app.data.repository.ProductRepositoryImp
import com.serkanonder.shopmood_app.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {
    @Binds // Binds the interface to the implementation
    abstract fun bindProductRepository(repositoryImp: ProductRepositoryImp): ProductRepository
}