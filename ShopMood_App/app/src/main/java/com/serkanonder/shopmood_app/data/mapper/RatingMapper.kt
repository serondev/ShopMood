package com.serkanonder.shopmood_app.data.mapper

import com.serkanonder.shopmood_app.domain.model.Rating
import com.serkanonder.shopmood_app.remote.model.RatingRemote
import javax.inject.Inject

class RatingMapper @Inject constructor(){
    // Map RatingRemote to Rating
    fun map(remote : RatingRemote): Rating {
        assertEssentialParams(remote)
        return Rating(
            rate = remote.rate!!,
            count = remote.count!!
        )

    }
    // Check if essential params are not null
    private fun assertEssentialParams(remote: RatingRemote){
        when{
            remote.rate == null -> {
                throw RuntimeException("The params: ProductRemote.rate is missing in received object: $remote")
            }
            remote.count == null -> {
                throw RuntimeException("The params: ProductRemote.count is missing in received object: $remote")
            }
        }
    }
}