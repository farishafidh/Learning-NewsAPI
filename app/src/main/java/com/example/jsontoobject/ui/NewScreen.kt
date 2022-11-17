package com.example.jsontoobject.ui

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.jsontoobject.model.Article
import com.example.jsontoobject.model.Source

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NewsApp(listArticle: List<Article>) {
    Scaffold(topBar = {
        TopAppBar() {
            Icon(Icons.Rounded.Menu, contentDescription = "Icon Home")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Headline News")
        }
    }) {
        LazyColumn {
            items(listArticle) { article ->
                NewsCard(article = article)
            }
        }
    }
}

@Composable
fun NewsCard(article: Article) {
    //supaya jadi card card gitu
    Card(elevation = 8.dp,
    modifier = Modifier.padding(8.dp)) {
        Column(
        ) {
            AsyncImage(
                model = article.urlToImage,
                contentDescription = "news image",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(text = article.title,
            modifier = Modifier.padding(8.dp))
        }
    }
}