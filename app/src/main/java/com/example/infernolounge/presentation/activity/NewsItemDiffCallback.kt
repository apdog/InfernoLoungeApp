package com.example.infernolounge.presentation.activity

import androidx.recyclerview.widget.DiffUtil
import com.example.infernolounge.domain.news.NewsItem

class NewsItemDiffCallback : DiffUtil.ItemCallback<NewsItem>() {
    override fun areItemsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem.newsId == newItem.newsId
    }

    override fun areContentsTheSame(oldItem: NewsItem, newItem: NewsItem): Boolean {
        return oldItem == newItem
    }

}