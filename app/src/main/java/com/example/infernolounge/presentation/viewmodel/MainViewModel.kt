package com.example.infernolounge.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.infernolounge.data.NewsListRepositoryImpl
import com.example.infernolounge.data.StockListRepositoryImpl
import com.example.infernolounge.domain.news.GetNewsListUseCase
import com.example.infernolounge.domain.news.News
import com.example.infernolounge.domain.news.ShareNewsUseCase
import com.example.infernolounge.domain.stock.GetStockListUseCase
import com.example.infernolounge.domain.stock.ShareStockUseCase
import com.example.infernolounge.domain.stock.Stock

class MainViewModel : ViewModel() {

    //реализация для чистой архитектуры неверная, пока так
    private val newsListRepository = NewsListRepositoryImpl
    private val stockListRepository = StockListRepositoryImpl

    // нам понадобиться 4 элемента бизнес логики
    private val getNewsListUseCase = GetNewsListUseCase(newsListRepository)
    private val shareNewsUseCase = ShareNewsUseCase(newsListRepository)

    private val getStockListUseCase = GetStockListUseCase(stockListRepository)
    private val shareStockUseCase = ShareStockUseCase(stockListRepository)

    val newsList = getNewsListUseCase.getNewsList()
    val stockList = getStockListUseCase.getStockList()
}