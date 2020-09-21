package com.recepyesilkaya.newsappviewpager.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.recepyesilkaya.newsappviewpager.R
import com.recepyesilkaya.newsappviewpager.model.NewsModel
import kotlinx.android.synthetic.main.activity_new_detail.*
import kotlinx.android.synthetic.main.adapter_news_item.*

class NewDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_detail)

        val newList=intent.getParcelableExtra<NewsModel>("key")

        txtDetail.text=newList?.newsName
        Glide.with(this)
            .load(newList?.image)
            .fitCenter()
            .into(imgDetail)
    }
}