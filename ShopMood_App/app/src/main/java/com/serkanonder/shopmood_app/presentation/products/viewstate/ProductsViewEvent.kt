package com.serkanonder.shopmood_app.presentation.products.viewstate

import com.serkanonder.shopmood_app.presentation.productsdetils.model.ProductDetailsUiModel

sealed class ProductsViewEvent {
    data class ClickOnProduct(val productDetailsUiModel: ProductDetailsUiModel) :
        ProductsViewEvent()

    object NoInternet : ProductsViewEvent()
}