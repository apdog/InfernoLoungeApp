package com.example.infernolounge.domain.stock

import androidx.lifecycle.LiveData

interface StockListRepository {

    fun getStockList(): LiveData<List<Stock>>

    fun shareStock(stock: Stock)

}