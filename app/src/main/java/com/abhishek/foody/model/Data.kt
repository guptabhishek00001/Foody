package com.abhishek.foody.model

data class Data(
    val bannerdata: List<Bannerdata>,
    val name: String,
    val openid: String,
    val productdata: List<Productdata>,
    val type: String
)