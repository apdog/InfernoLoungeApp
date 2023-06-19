package com.example.infernolounge.presentation.activity

import androidx.recyclerview.widget.DiffUtil
import com.example.infernolounge.domain.news.NewsItem
import com.example.infernolounge.domain.stock.StockItem

class StockListDiffCallback(
    private val oldList: List<StockItem>,
    private val newList: List<StockItem>,
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = oldList[newItemPosition]
        return oldItem.stockId == newItem.stockId
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = oldList[newItemPosition]
        return oldItem == newItem
    }
}