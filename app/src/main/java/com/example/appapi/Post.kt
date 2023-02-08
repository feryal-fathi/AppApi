package com.example.appapi

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val id: Int,
    val brand: String,
    val name: String,
    val price:Float,
    val image_link:String

)