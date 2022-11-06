package com.serkanonder.shopmood_app.presentation.productsdetils.mapper

import com.serkanonder.shopmood_app.domain.model.Product
import com.serkanonder.shopmood_app.presentation.productsdetils.model.ProductDetailsUiModel
import javax.inject.Inject

class ProductDetailsUiMapper @Inject constructor() {

    fun map(product: Product): ProductDetailsUiModel {

        return ProductDetailsUiModel(
            image = product.image,
            title = product.title,
            price = product.price,
            rate = product.rating.rate,
            description = product.description
        )
    }
}