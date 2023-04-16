package com.example.infernolounge.domain.news

// для взаимодействия с дата слоем
interface NewsListRepository {

    fun getNewsList(): List<News>

    fun shareNews(news: News)

}