package com.example.infernolounge.domain.news

//поделиться новостью
class ShareNewsUseCase(private val newsListRepository: NewsListRepository) {

    fun shareNews(news: NewsItem) {
        newsListRepository.shareNews(news)
    }

}