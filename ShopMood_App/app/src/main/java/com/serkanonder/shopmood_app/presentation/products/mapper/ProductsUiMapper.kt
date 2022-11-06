package com.serkanonder.shopmood_app.presentation.products.mapper

import com.serkanonder.shopmood_app.domain.model.Product
import com.serkanonder.shopmood_app.presentation.products.model.ProductsUiModel
import javax.inject.Inject

class ProductUiMapper @Inject constructor() {

    fun map(product: List<Product>): List<ProductsUiModel> {

        return product.map {
            ProductsUiModel(
                id = it.id,
                image = it.image,
                title = it.title,
                price = it.price
            )
        }
    }
}