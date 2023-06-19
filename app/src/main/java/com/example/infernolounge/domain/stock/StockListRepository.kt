package com.example.infernolounge.domain.stock

import androidx.lifecycle.LiveData

interface StockListRepository {

    fun getStockList(): LiveData<List<StockItem>>

    fun shareStock(stock: StockItem)

}