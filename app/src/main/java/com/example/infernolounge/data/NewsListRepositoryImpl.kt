package com.example.infernolounge.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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
    private val newsListLivedata = MutableLiveData<List<News>>()

    override fun getNewsList(): LiveData<List<News>> {
        return newsListLivedata
    }

    override fun shareNews(news: News) {
        TODO()
    }

    //метод обновления списка на всякий случай
    private fun updateList(){
        newsListLivedata.value = newsList.toList()
    }

}