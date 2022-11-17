package com.example.jsontoobject.network

import com.example.jsontoobject.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://run.mocky.io/"

val retrofit =  Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsApiService {
    @GET("v3/4a6b4002-e45f-4ffd-8b9e-508419c6ff0a")
    suspend fun getTopHeadline(): NewsData

//    @GET("api path yang baru")
//    suspend fun getTopHeadline(): GameData
}