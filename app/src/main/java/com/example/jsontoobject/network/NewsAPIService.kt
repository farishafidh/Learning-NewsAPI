package com.example.jsontoobject.network

import com.example.jsontoobject.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2/"

private val retrofit =  Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsApiService {
    @GET("top-headlines?country=id&apiKey=e787a8930928439faf968502f0a055d9")
    suspend fun getTopHeadline(): NewsData

//    @GET("api path yang baru")
//    suspend fun getTopHeadline(): GameData
}

object Api{
    val newsApiService: NewsApiService by lazy {
        retrofit.create(NewsApiService::class.java)
    }
//    val gameApiService: GameApiService by lazy {
//        retrofit.create(GameApiService::class.java)
//    }
}