package com.example.infernolounge.presentation.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.infernolounge.R

class NewsItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_item)
        val mode = intent.getStringExtra("extra_mode")
    }
    companion object {
        private const val EXTRA_SCREEN_MODE = "extra_mode"
        private const val EXTRA_NEWS_ITEM_ID = "extra_news_item_id"
        private const val MODE_SHOW = "mode_show"
        fun newsIntentShowItem(context: Context, newsItemId: Int): Intent {
            val intent = Intent(context, NewsItemActivity::class.java)
            intent.putExtra(EXTRA_SCREEN_MODE, MODE_SHOW)
            intent.putExtra(EXTRA_NEWS_ITEM_ID, newsItemId)
            return intent
        }
    }
}