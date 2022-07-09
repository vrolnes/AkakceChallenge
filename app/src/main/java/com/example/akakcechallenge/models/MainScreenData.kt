package com.example.akakcechallenge.models

data class MainResult(
    val result: Result?
)

data class Result(
    val horizontalProducts: List<HorizontalProduct>?,
    val nextUrl: String?,
    val products: List<Product>?
)

data class HorizontalProduct(
    val code: Int?,
    val countOfPrices: Int?,
    val dropRatio: Double?,
    val followCount: Int?,
    val imageUrl: String?,
    val name: String?,
    val price: Double?
)

data class Product(
    val code: Int?,
    val countOfPrices: Int?,
    val dropRatio: Double?,
    val followCount: Int?,
    val imageUrl: String?,
    val name: String?,
    val price: Double?
)