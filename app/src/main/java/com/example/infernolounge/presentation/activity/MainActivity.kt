package com.example.infernolounge.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
        viewModel.newsList.observe(this){
            newsListAdapter.newsList = it
        }
        viewModel.stockList.observe(this){
            stockListAdapter.stockList = it
        }
        setupStockListRecyclerView()
        setupNewsListRecyclerView()
    }

    private fun setupStockListRecyclerView() {
        val rvStockList = findViewById<RecyclerView>(R.id.rv_stock_list)
        with(rvStockList) {
            stockListAdapter = StockListAdapter()
            adapter = stockListAdapter
        }
        setupStockClickListener()
    }

    private fun setupStockClickListener() {
        stockListAdapter.onStockItemClickListener = {
            Toast.makeText(this, it.stockName, Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupNewsListRecyclerView() {
        val rvNewsList = findViewById<RecyclerView>(R.id.rv_news_list)
        with(rvNewsList) {
            newsListAdapter = NewsListAdapter()
            adapter = newsListAdapter
        }
        setupNewsClickListener()
    }

    private fun setupNewsClickListener() {
        newsListAdapter.onNewsItemClickListener = {
            Toast.makeText(this, it.newsName, Toast.LENGTH_SHORT).show()
        }
    }
}