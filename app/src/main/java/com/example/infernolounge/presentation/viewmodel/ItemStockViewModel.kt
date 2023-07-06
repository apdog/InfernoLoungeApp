package com.example.infernolounge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.infernolounge.data.StockListRepositoryImpl
import com.example.infernolounge.domain.stock.GetStockItemUseCase

class ItemStockViewModel : ViewModel() {

    private val repository = StockListRepositoryImpl

    private val getStockItemUseCase = GetStockItemUseCase(repository)

    fun getStockItem(stockItemId: Int){
        val item = getStockItemUseCase.getStockItemId(stockItemId)
    }
}