package com.example.infernolounge.domain.stock

import java.util.Date

data class StockItem(
    val stockId: Int,
    val stockName: String,
    val stockDescription: String,
    val stockImage: Int,
    val stockDate: Date
)
