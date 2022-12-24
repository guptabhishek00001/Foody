package com.abhishek.foody.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api : CategoryApi by lazy {
                Retrofit.Builder()
                    .baseUrl("")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(CategoryApi::class.java)
    }

}