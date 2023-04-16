package com.example.infernolounge.domain.news

// получение списка новостей
class GetNewsListUseCase(private val newsListRepository: NewsListRepository) {

    fun getNewsList(): List<News>{
        return newsListRepository.getNewsList()
    }

}