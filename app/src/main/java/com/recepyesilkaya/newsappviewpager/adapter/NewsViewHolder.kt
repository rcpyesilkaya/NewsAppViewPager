package com.recepyesilkaya.newsappviewpager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.recepyesilkaya.newsappviewpager.R
import com.recepyesilkaya.newsappviewpager.model.NewsModel
import kotlinx.android.synthetic.main.adapter_news_item.view.*

class NewsViewHolder(private val parent: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.adapter_news_item, parent, false)
    ) {
    fun bind(newsList: NewsModel,position:Int, setOnClickListener: (NewsModel, Int) -> Unit) {
        itemView.txtNewsName.text = newsList.newsName
        Glide.with(parent.context)
            .load(newsList.image)
            .fitCenter()
            .into(itemView.imgNews)

        itemView.setOnClickListener {
            setOnClickListener(newsList,position)
        }

    }
}