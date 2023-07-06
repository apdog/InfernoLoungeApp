package com.example.infernolounge.domain.news

class GetNewsItemUseCase(private val newsListRepository: NewsListRepository) {

    fun getNewsItemId(newsItemId: Int): NewsItem {
        return newsListRepository.getNewsItemId(newsItemId)
    }
}