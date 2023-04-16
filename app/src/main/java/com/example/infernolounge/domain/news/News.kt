package com.example.infernolounge.domain.news

//основа бизнес логики
data class News(
    val newsId: Int,
    val newsName: String,
    val newsDescription: String,
    val newsImage: Int
)
