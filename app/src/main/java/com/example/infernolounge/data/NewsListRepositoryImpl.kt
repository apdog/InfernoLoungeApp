package com.example.infernolounge.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.infernolounge.R
import com.example.infernolounge.domain.news.NewsItem
import com.example.infernolounge.domain.news.NewsListRepository
import java.util.Date

object NewsListRepositoryImpl : NewsListRepository {

    private val newsListLivedata = MutableLiveData<List<NewsItem>>()

    private val newsList = mutableListOf(
        NewsItem(
            1,
            "Новость",
            "А мы приготовили для Вас новые акции, конечно, не забыв и про старые.\n" +
                    "\n" +
                    "Недорого и отлично провести вечер - это в Inferno lounge",
            R.drawable.news_food,
            Date()
        ),
        NewsItem(
            2,
            "Новость",
            "А мы приготовили для Вас новые акции, конечно, не забыв и про старые.\n" +
                    "\n" +
                    "Недорого и отлично провести вечер - это в Inferno lounge",
            R.drawable.news_food,
            Date()
        ),
        NewsItem(
            3,
            "Новость",
            "А мы приготовили для Вас новые акции, конечно, не забыв и про старые.\n" +
                    "\n" +
                    "Недорого и отлично провести вечер - это в Inferno lounge",
            R.drawable.news_food,
            Date()
        ),
        NewsItem(
            4,
            "Новость",
            "А мы приготовили для Вас новые акции, конечно, не забыв и про старые.\n" +
                    "\n" +
                    "Недорого и отлично провести вечер - это в Inferno lounge",
            R.drawable.news_food,
            Date()
        )
    )


    override fun getNewsList(): LiveData<List<NewsItem>> {
        updateList()
        return newsListLivedata
    }

    override fun shareNews(news: NewsItem) {
        TODO("Not yet implemented")
    }

    private fun updateList() {
        newsListLivedata.value = newsList.toMutableList()
    }
}