package com.example.RecipeApplication.network

import com.example.RecipeApplication.network.model.RecipeDto
import com.example.RecipeApplication.network.response.RecipeSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RecipeRetrofitService {

    @GET("search")
    suspend fun search(
        @Header("Authorization")token:String,
        @Query("page") page:Int,
        @Query("query")query:String,
    ):RecipeSearchResponse

    @GET("get")
    suspend fun get(
        @Header("Authorization")token: String,
        @Query("id")id:Int,
    ):RecipeDto
}