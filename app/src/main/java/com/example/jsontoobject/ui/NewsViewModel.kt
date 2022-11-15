package com.example.jsontoobject.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jsontoobject.model.Article
import com.example.jsontoobject.network.Api
import kotlinx.coroutines.launch

class NewsViewModel: ViewModel() {
    init {
        getListNews()
    }
    fun getListNews(){
        viewModelScope.launch{
            val response = Api.newsApiService.getTopHeadline()
            val articles = response.articles

            response.articles.forEach { article: Article ->
                Log.d("response", article.toString())
            }

        }
    }
}