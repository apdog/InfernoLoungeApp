package com.example.infernolounge.data

import com.example.infernolounge.R
import com.example.infernolounge.domain.news.News
import com.example.infernolounge.domain.news.NewsListRepository

object NewsListRepositoryImpl: NewsListRepository {

    private val newsList = mutableListOf(
        News(1, "Вечеринка в стиле диско", "недавно в нашеи заведении " +
                "прошла вечеринка в стиле диско. Фотоотчет вы можете посмотреть по ссылке снизу либо в нашей группе в вк", R.drawable.ic_news),
        News(2, "Вечеринка в стиле диско", "недавно в нашеи заведении " +
                "прошла вечеринка в стиле диско. Фотоотчет вы можете посмотреть по ссылке снизу либо в нашей группе в вк", R.drawable.ic_news),
        News(3, "Вечеринка в стиле диско", "недавно в нашеи заведении " +
                "прошла вечеринка в стиле диско. Фотоотчет вы можете посмотреть по ссылке снизу либо в нашей группе в вк", R.drawable.ic_news),
        News(4, "Вечеринка в стиле диско", "недавно в нашеи заведении " +
                "прошла вечеринка в стиле диско. Фотоотчет вы можете посмотреть по ссылке снизу либо в нашей группе в вк", R.drawable.ic_news),
    )

    override fun getNewsList(): List<News> {
        return newsList.toMutableList()
    }

    override fun shareNews(news: News) {
        TODO()
    }

}