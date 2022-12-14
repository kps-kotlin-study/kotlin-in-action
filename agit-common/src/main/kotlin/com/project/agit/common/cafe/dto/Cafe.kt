package com.project.agit.common.cafe.dto

data class CafeMenu (
    val productId: Int,
    val productName: String,
    val productPrice: Int,
    var productStock: Int
)