package com.example.infernolounge.domain.stock

interface StockListRepository {

    fun getStockList(): List<Stock>

    fun shareStock(stock: Stock)

}