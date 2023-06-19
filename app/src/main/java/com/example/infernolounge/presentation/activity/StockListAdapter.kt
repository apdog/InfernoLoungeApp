package com.example.infernolounge.presentation.activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.infernolounge.R
import com.example.infernolounge.domain.news.NewsItem
import com.example.infernolounge.domain.stock.StockItem

class StockListAdapter : RecyclerView.Adapter<StockListAdapter.StockListViewHolder>() {

    var onStockItemClickListener: ((StockItem) -> Unit)? = null

    var stockList = listOf<StockItem>()
        set(value) {
            val callback = StockListDiffCallback(stockList,value)
            val diffResult = DiffUtil.calculateDiff(callback)
            diffResult.dispatchUpdatesTo(this)
            field = value
        }

    class StockListViewHolder(val view: View) :RecyclerView.ViewHolder(view) {
        val stockImage = view.findViewById<ImageView>(R.id.image_stock_place)
        val stockName = view.findViewById<TextView>(R.id.stock_name)
        val stockDescription = view.findViewById<TextView>(R.id.stock_description)
        val stockDate = view.findViewById<TextView>(R.id.stock_date)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_stock, parent, false)
        return StockListViewHolder(view)
    }

    override fun onBindViewHolder(holder: StockListViewHolder, position: Int) {
        val stockItem = stockList[position]
        holder.view.setOnClickListener {
            onStockItemClickListener?.invoke(stockItem)
            true
        }
        holder.stockName?.text = stockItem.stockName
        holder.stockDate?.text = stockItem.stockDate.toString()
        holder.stockDescription?.text = stockItem.stockDescription
        holder.stockImage?.setImageResource(stockItem.stockImage)
    }

    override fun getItemCount(): Int {
        return stockList.size
    }

}