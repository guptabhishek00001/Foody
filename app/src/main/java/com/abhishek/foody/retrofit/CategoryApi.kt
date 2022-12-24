package com.abhishek.foody.retrofit

import com.abhishek.foody.model.ApiResponseCategory
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CategoryApi {

    @GET("/india/foodordering/admin/api/home")
    fun getCategory(@Query("page") page:Int) : Call<ApiResponseCategory>

}