package com.example.infernolounge.presentation.activity

import androidx.recyclerview.widget.DiffUtil
import com.example.infernolounge.domain.news.NewsItem

class NewsListDiffCallback(
    private val oldList: List<NewsItem>,
    private val newList: List<NewsItem>,
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
        return oldItem.newsId == newItem.newsId
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = oldList[newItemPosition]
        return oldItem == newItem
    }
}