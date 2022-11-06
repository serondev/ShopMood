package com.serkanonder.shopmood_app.domain.repository

import com.serkanonder.shopmood_app.domain.model.Product
import io.reactivex.rxjava3.core.Single

interface ProductRepository {
    fun getProducts(): Single<List<Product>> // Single is a reactive type that emits a single value and then completes
} // end of interface ProductRepository