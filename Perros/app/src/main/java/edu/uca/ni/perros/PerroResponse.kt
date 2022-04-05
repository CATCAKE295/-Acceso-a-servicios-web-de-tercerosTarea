package edu.uca.ni.perros

import com.google.gson.annotations.SerializedName


data class PerroResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)
