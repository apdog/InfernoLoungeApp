package com.example.infernolounge.presentation.activity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.infernolounge.R

class NewsListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val newsImage = view.findViewById<ImageView>(R.id.image_news_place)
    val newsName = view.findViewById<TextView>(R.id.news_name)
    val newsDescription = view.findViewById<TextView>(R.id.news_description)
    val newsDate = view.findViewById<TextView>(R.id.news_date)
}