package com.serkanonder.shopmood_app.remote.api

import com.serkanonder.shopmood_app.remote.model.ProductRemote
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ProductApiService {
    @GET("products")
    fun getProducts(): Single<List<ProductRemote>>
}