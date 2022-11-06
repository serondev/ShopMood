package com.serkanonder.shopmood_app.remote.model

import com.google.gson.annotations.SerializedName

data class RatingRemote(
    @SerializedName("rate")
    val rate: Float?,
    @SerializedName("count")
    val count: Int?
)