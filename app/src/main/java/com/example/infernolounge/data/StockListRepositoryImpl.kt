package com.example.infernolounge.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.infernolounge.R
import com.example.infernolounge.domain.stock.StockItem
import com.example.infernolounge.domain.stock.StockListRepository
import java.util.Date

object StockListRepositoryImpl : StockListRepository {

    private val stockListLivedata = MutableLiveData<List<StockItem>>()

    private val stockList = mutableListOf(
        StockItem(
            1, "Скидка 10% на кальяны", "Скидка на новые виды " +
                    "кальянов 10% только до 10 мая!", R.drawable.stock_custom_image, Date()
        ),
        StockItem(
            2, "Скидка 10% на кальяны", "Скидка на новые виды " +
                    "кальянов 10% только до 10 мая!", R.drawable.stock_custom_image, Date()
        ),
        StockItem(
            3, "Скидка 10% на кальяны", "Скидка на новые виды " +
                    "кальянов 10% только до 10 мая!", R.drawable.stock_custom_image, Date()
        ),
        StockItem(
            4, "Скидка 10% на кальяны", "Скидка на новые виды " +
                    "кальянов 10% только до 10 мая!", R.drawable.stock_custom_image, Date()
        )
    )


    override fun getStockList(): LiveData<List<StockItem>> {
        updateList()
        return stockListLivedata
    }

    override fun shareStock(stock: StockItem) {
        TODO("Not yet implemented")
    }

    private fun updateList() {
        stockListLivedata.value = stockList.toMutableList()
    }
}