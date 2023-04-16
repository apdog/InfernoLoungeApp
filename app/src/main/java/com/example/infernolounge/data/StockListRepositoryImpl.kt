package com.example.infernolounge.data

import com.example.infernolounge.R
import com.example.infernolounge.domain.news.News
import com.example.infernolounge.domain.stock.Stock
import com.example.infernolounge.domain.stock.StockListRepository

object StockListRepositoryImpl: StockListRepository {

    private val stockList = mutableListOf(
        Stock(1, "Скидка 10% на кальяны", "Скидка на новые виды " +
                "кальянов 10% только до 10 мая!", R.drawable.ic_percent),
        Stock(2, "Скидка 10% на кальяны", "Скидка на новые виды " +
                "кальянов 10% только до 10 мая!", R.drawable.ic_percent),
        Stock(3, "Скидка 10% на кальяны", "Скидка на новые виды " +
                "кальянов 10% только до 10 мая!", R.drawable.ic_percent),
        Stock(4, "Скидка 10% на кальяны", "Скидка на новые виды " +
                "кальянов 10% только до 10 мая!", R.drawable.ic_percent),
    )

    override fun getStockList(): List<Stock> {
        return stockList.toMutableList()
    }

    override fun shareStock(stock: Stock) {
        TODO("Not yet implemented")
    }
}