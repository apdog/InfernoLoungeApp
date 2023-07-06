package com.example.infernolounge.domain.stock

class GetStockItemUseCase(private val stockListRepository: StockListRepository) {

    fun getStockItemId(stockItemId: Int): StockItem {
        return stockListRepository.getStockItemId(stockItemId)
    }
}