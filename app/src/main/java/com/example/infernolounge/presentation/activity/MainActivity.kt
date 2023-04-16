package com.example.infernolounge.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.infernolounge.R
import com.example.infernolounge.presentation.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.newsList.observe(this){
            Log.d("!!!", it.toString())
        }
        viewModel.stockList.observe(this){
            Log.d("!!!", it.toString())
        }
    }
}