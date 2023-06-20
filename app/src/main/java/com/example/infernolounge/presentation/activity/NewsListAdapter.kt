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


class NewsListAdapter : RecyclerView.Adapter<NewsListAdapter.NewsListViewHolder>() {
    var onNewsItemClickListener: ((NewsItem) -> Unit)? = null

    var newsList = listOf<NewsItem>()
        set(value) {
            val callback = NewsListDiffCallback(newsList,value)
            val diffResult = DiffUtil.calculateDiff(callback)
            diffResult.dispatchUpdatesTo(this)
            field = value
        }

    class NewsListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val newsImage = view.findViewById<ImageView>(R.id.image_news_place)
        val newsName = view.findViewById<TextView>(R.id.news_name)
        val newsDescription = view.findViewById<TextView>(R.id.news_description)
        val newsDate = view.findViewById<TextView>(R.id.news_date)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsListViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsListViewHolder, position: Int) {
        val stockItem = newsList[position]
        holder.view.setOnClickListener {
            onNewsItemClickListener?.invoke(stockItem)
            true
        }
        holder.newsName?.text = stockItem.newsName
        holder.newsDate?.text = stockItem.newsDate.toString()
        holder.newsDescription?.text = stockItem.newsDescription
        holder.newsImage?.setImageResource(stockItem.newsImage)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}