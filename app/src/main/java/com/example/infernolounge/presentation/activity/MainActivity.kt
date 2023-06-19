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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.newsList.observe(this){
            TODO()
        }
        viewModel.stockList.observe(this){
            stockListAdapter.stockList = it
        }
        setupStockListRecyclerView()
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
}