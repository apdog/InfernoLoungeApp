package com.example.infernolounge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.infernolounge.data.NewsListRepositoryImpl
import com.example.infernolounge.domain.news.GetNewsItemUseCase

class ItemNewsViewModel : ViewModel() {

    private val repository = NewsListRepositoryImpl

    private val getNewsItemUseCase = GetNewsItemUseCase(repository)

    fun getNewsItem(newsItemId: Int){
        val item = getNewsItemUseCase.getNewsItemId(newsItemId)
    }
}