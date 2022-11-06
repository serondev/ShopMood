package com.serkanonder.shopmood_app.data.mapper

import com.serkanonder.shopmood_app.domain.model.Product
import com.serkanonder.shopmood_app.remote.model.ProductRemote
import javax.inject.Inject

class ProductMapper @Inject constructor(
    private val ratingMapper: RatingMapper // Dependency injection
) {
    // Map remote product to domain product
    fun mapList(remote: List<ProductRemote>): List<Product> {
        assertEssentialParams(remote)

        return remote.map {
            Product(
                id = it.id!!,
                title = it.title!!,
                price = it.price!!,
                description = it.description!!,
                image = it.image!!,
                rating = ratingMapper.map(it.rating!!)
            )
        } // map
    } // mapList

    private fun assertEssentialParams(remote: List<ProductRemote>){
        remote.forEach{
            when {
                it.id == null -> {
                    throw RuntimeException("The params: ProductRemote.id is missing in received object: $it")
                }
                it.title == null -> {
                    throw RuntimeException("The params: ProductRemote.title is missing in received object: $it")
                }
                it.price == null -> {
                    throw RuntimeException("The params: ProductRemote.price is missing in received object: $it")
                }
                it.description == null -> {
                    throw RuntimeException("The params: ProductRemote.description is missing in received object: $it")
                }
                it.image == null -> {
                    throw RuntimeException("The params: ProductRemote.image is missing in received object: $it")
                }
                it.rating == null -> {
                    throw RuntimeException("The params: ProductRemote.image is missing in received object: $remote")
                }
            }
        }
    }
}