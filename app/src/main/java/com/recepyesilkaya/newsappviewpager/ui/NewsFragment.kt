package com.recepyesilkaya.newsappviewpager.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.recepyesilkaya.newsappviewpager.R
import com.recepyesilkaya.newsappviewpager.adapter.NewsRecyclerViewAdapter
import com.recepyesilkaya.newsappviewpager.mock.mock
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcyNews.adapter= NewsRecyclerViewAdapter(mock.getNewsList()){ newsModel, position->
            val intent = Intent(this.context, NewDetailActivity::class.java)
            intent.putExtra("key", newsModel)
            startActivity(intent)
        }
    }

}