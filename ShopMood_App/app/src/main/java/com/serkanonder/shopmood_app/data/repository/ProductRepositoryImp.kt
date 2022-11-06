package com.serkanonder.shopmood_app.data.repository

import com.serkanonder.shopmood_app.data.mapper.ProductMapper
import com.serkanonder.shopmood_app.domain.model.Product
import com.serkanonder.shopmood_app.domain.repository.ProductRepository
import com.serkanonder.shopmood_app.remote.api.ProductApiService
import io.reactivex.rxjava3.core.Single

import javax.inject.Inject

class ProductRepositoryImp @Inject constructor(
    private val productApiService: ProductApiService,
    private val productMapper: ProductMapper
) : ProductRepository {
    override fun getProducts(): Single<List<Product>> {
        return productApiService.getProducts().map { productMapper.mapList(it) }
    // mapList is a function that maps the list of ProductResponse to Product
    }

}