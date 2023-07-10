package com.example.infernolounge.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.infernolounge.R
import com.example.infernolounge.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var stockListAdapter: StockListAdapter
    private lateinit var newsListAdapter: NewsListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.newsList.observe(this) {
            newsListAdapter.submitList(it)
        }
        viewModel.stockList.observe(this) {
            stockListAdapter.submitList(it)
        }
        setupStockListRecyclerView()
        setupNewsListRecyclerView()
    }

    private fun setupStockListRecyclerView() {
        val rvStockList = findViewById<RecyclerView>(R.id.recycler_view_stock_list)
        with(rvStockList) {
            stockListAdapter = StockListAdapter()
            adapter = stockListAdapter
        }
        setupStockClickListener()
    }

    private fun setupStockClickListener() {
        stockListAdapter.onStockItemClickListener = {
            val intent = StockItemActivity.stockIntentShowItem(this, it.stockId)
            startActivity(intent)
        }
    }

    private fun setupNewsListRecyclerView() {
        val rvNewsList = findViewById<RecyclerView>(R.id.recycler_view_news_list)
        with(rvNewsList) {
            newsListAdapter = NewsListAdapter()
            adapter = newsListAdapter
        }
        setupNewsClickListener()
    }

    private fun setupNewsClickListener() {
        newsListAdapter.onNewsItemClickListener = {
            val intent = NewsItemActivity.newsIntentShowItem(this, it.newsId)
            startActivity(intent)
        }
    }
}