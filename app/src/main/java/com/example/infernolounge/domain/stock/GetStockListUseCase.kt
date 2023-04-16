package com.example.infernolounge.domain.stock

import androidx.lifecycle.LiveData

class GetStockListUseCase(private val stockListRepository: StockListRepository) {

    fun getStockList(): LiveData<List<Stock>>{
        return stockListRepository.getStockList()
    }

}