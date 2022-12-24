package com.abhishek.foody.model

data class ApiResponseCategory(
    val `data`: List<Data>,
    val links: Links,
    val meta: Meta
)