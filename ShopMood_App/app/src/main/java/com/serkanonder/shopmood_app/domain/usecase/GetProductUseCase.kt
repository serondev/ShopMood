package com.serkanonder.shopmood_app.domain.usecase

import com.serkanonder.shopmood_app.domain.model.Product
import com.serkanonder.shopmood_app.domain.repository.ProductRepository
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class GetProductUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    fun execute(): Single<List<Product>> {
        return repository.getProducts() // Getting products from repository
            .subscribeOn(Schedulers.io()) // Run on a background thread
    }
}