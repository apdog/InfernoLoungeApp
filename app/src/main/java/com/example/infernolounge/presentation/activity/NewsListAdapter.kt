package com.example.infernolounge.presentation.activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.infernolounge.R
import com.example.infernolounge.domain.news.NewsItem


class NewsListAdapter : ListAdapter<NewsItem, NewsListViewHolder>(NewsItemDiffCallback()) {
    var onNewsItemClickListener: ((NewsItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsListViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsListViewHolder, position: Int) {
        val stockItem = getItem(position)
        holder.view.setOnClickListener {
            onNewsItemClickListener?.invoke(stockItem)
            true
        }
        holder.newsName?.text = stockItem.newsName
        holder.newsDate?.text = stockItem.newsDate.toString()
        holder.newsDescription?.text = stockItem.newsDescription
        holder.newsImage?.setImageResource(stockItem.newsImage)
    }

}