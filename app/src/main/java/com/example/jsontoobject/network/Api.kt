package com.example.jsontoobject.network

object Api{
    val newsApiService: NewsApiService by lazy {
        retrofit.create(NewsApiService::class.java)
    }
}