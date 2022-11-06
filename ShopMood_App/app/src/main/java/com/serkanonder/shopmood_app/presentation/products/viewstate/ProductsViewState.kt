package com.serkanonder.shopmood_app.presentation.products.viewstate

import com.serkanonder.shopmood_app.presentation.products.model.ProductsUiModel

sealed class ProductsViewState {

    object Error : ProductsViewState()

    object Loading : ProductsViewState()

    object NoInternet : ProductsViewState()

    data class Success(val product: List<ProductsUiModel>) : ProductsViewState()
}