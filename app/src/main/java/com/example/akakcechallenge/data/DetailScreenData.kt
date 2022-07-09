package com.example.akakcechallenge.data

data class DetailScreenResult(
    val result: DetailResult
)

data class DetailResult(
    val badge: String,
    val countOfPrices: Int,
    val freeShipping: Boolean,
    val imageUrl: String,
    val lastUpdate: String,
    val mkName: String,
    val price: Int,
    val productName: String,
    val rating: Double,
    val storageOptions: List<String>
)