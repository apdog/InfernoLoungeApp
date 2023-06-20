package com.example.infernolounge.presentation.activity

import androidx.recyclerview.widget.DiffUtil
import com.example.infernolounge.domain.stock.StockItem

class StockItemDiffCallback : DiffUtil.ItemCallback<StockItem>() {
    override fun areItemsTheSame(oldItem: StockItem, newItem: StockItem): Boolean {
        return oldItem.stockId == newItem.stockId
    }

    override fun areContentsTheSame(oldItem: StockItem, newItem: StockItem): Boolean {
        return oldItem == newItem
    }

}