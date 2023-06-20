package com.example.infernolounge.domain.news

import java.util.Date

//основа бизнес логики
data class NewsItem(
    val newsId: Int,
    val newsName: String,
    val newsDescription: String,
    val newsImage: Int,
    val newsDate: Date
)
