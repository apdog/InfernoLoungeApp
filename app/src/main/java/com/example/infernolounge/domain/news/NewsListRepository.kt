package com.example.infernolounge.domain.news

import androidx.lifecycle.LiveData

// для взаимодействия с дата слоем
interface NewsListRepository {

    fun getNewsList(): LiveData<List<NewsItem>>

    fun shareNews(news: NewsItem)

    fun getNewsItemId(newsItemId: Int): NewsItem

}