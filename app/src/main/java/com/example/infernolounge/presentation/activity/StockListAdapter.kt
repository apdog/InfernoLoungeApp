package com.example.infernolounge.presentation.activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.infernolounge.R
import com.example.infernolounge.domain.stock.StockItem

class StockListAdapter : ListAdapter<StockItem, StockListViewHolder>(StockItemDiffCallback()) {

    var onStockItemClickListener: ((StockItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_stock, parent, false)
        return StockListViewHolder(view)
    }

    override fun onBindViewHolder(holder: StockListViewHolder, position: Int) {
        val stockItem = getItem(position)
        holder.view.setOnClickListener {
            onStockItemClickListener?.invoke(stockItem)
            true
        }
        holder.stockName?.text = stockItem.stockName
        holder.stockDate?.text = stockItem.stockDate.toString()
        holder.stockDescription?.text = stockItem.stockDescription
        holder.stockImage?.setImageResource(stockItem.stockImage)
    }

}