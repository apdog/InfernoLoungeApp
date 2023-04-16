package com.example.infernolounge.domain.news

import androidx.lifecycle.LiveData

// получение списка новостей
class GetNewsListUseCase(private val newsListRepository: NewsListRepository) {

    fun getNewsList(): LiveData<List<News>>{
        return newsListRepository.getNewsList()
    }

}