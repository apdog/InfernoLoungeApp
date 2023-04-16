package com.example.infernolounge.domain.stock

class GetStockListUseCase(private val stockListRepository: StockListRepository) {

    fun getStockList(): List<Stock>{
        return stockListRepository.getStockList()
    }

}