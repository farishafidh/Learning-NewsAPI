package com.example.jsontoobject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jsontoobject.ui.NewsApp
import com.example.jsontoobject.ui.NewsCard
import com.example.jsontoobject.ui.NewsViewModel
import com.example.jsontoobject.ui.theme.JsonToObjectTheme

class MainActivity : ComponentActivity() {
    val newsModel = viewModels<NewsViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsApp(newsModel.value.newsUiState)
        }
    }
}



//
//@Composable
//fun Greeting(name: String) {
//    val newsViewModel: NewsViewModel = viewModel()
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JsonToObjectTheme {
//        Greeting("Android")
//    }
//}