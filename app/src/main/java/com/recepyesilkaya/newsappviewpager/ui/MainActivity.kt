package com.recepyesilkaya.newsappviewpager.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recepyesilkaya.newsappviewpager.R
import com.recepyesilkaya.newsappviewpager.adapter.NewsViewPagerAdapter
import com.recepyesilkaya.newsappviewpager.mock.mock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vwpgNews.adapter = NewsViewPagerAdapter(mock.getListFragment(), supportFragmentManager)
        tblyNewsCategory.setupWithViewPager(vwpgNews)
    }
}