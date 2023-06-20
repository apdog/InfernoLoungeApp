package com.example.infernolounge.presentation.activity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.infernolounge.R

class StockListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val stockImage = view.findViewById<ImageView>(R.id.image_stock_place)
    val stockName = view.findViewById<TextView>(R.id.stock_name)
    val stockDescription = view.findViewById<TextView>(R.id.stock_description)
    val stockDate = view.findViewById<TextView>(R.id.stock_date)
}