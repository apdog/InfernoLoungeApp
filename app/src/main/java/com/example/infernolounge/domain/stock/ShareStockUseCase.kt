package com.example.infernolounge.domain.stock

class ShareStockUseCase(private val stockListRepository: StockListRepository) {

    fun shareStock(stock: StockItem) {
        stockListRepository.shareStock(stock)
    }

}