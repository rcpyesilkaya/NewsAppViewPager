package com.recepyesilkaya.newsappviewpager.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recepyesilkaya.newsappviewpager.model.NewsModel

class NewsRecyclerViewAdapter(
    private val newsList: List<NewsModel>,
    private val setOnClickListener: (NewsModel, Int) -> Unit
) : RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder =
        NewsViewHolder(parent)

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(newsList[position],position,setOnClickListener)
    }

    override fun getItemCount(): Int = newsList.size
}