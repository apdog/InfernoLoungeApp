package com.example.infernolounge.domain.news

import androidx.lifecycle.LiveData

// для взаимодействия с дата слоем
interface NewsListRepository {

    fun getNewsList(): LiveData<List<News>>

    fun shareNews(news: News)

}