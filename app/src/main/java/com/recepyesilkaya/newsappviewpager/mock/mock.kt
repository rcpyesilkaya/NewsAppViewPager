package com.recepyesilkaya.newsappviewpager.mock

import com.recepyesilkaya.newsappviewpager.model.FragmentModel
import com.recepyesilkaya.newsappviewpager.model.NewsModel
import com.recepyesilkaya.newsappviewpager.ui.NewsFragment

object mock {
    fun getListFragment(): List<FragmentModel> {

        val fragmentList = ArrayList<FragmentModel>()
        val newsFragment = FragmentModel("ANASAYFA", NewsFragment())
        val newsFragment1 = FragmentModel("YAZARLAR", NewsFragment())
        val newsFragment2 = FragmentModel("GÜNDEM", NewsFragment())
        val newsFragment3 = FragmentModel("SİYASET", NewsFragment())
        val newsFragment4 = FragmentModel("EKONOMİ", NewsFragment())
        val newsFragment5 = FragmentModel("SPOR", NewsFragment())
        val newsFragment6 = FragmentModel("DÜNYA", NewsFragment())


        fragmentList.add(newsFragment)
        fragmentList.add(newsFragment1)
        fragmentList.add(newsFragment2)
        fragmentList.add(newsFragment3)
        fragmentList.add(newsFragment4)
        fragmentList.add(newsFragment5)
        fragmentList.add(newsFragment6)

        return fragmentList
    }
    fun getNewsList():List<NewsModel>{

        val newsList=ArrayList<NewsModel>()

        val news= NewsModel("Elektrikte 131 milyon liralık destek ödemesi","https://i2.milimaj.com/i/milliyet/75/0x410/5f4df4f45542800470aa5985.jpg")

        repeat(10){
            newsList.add(news)
        }
        return  newsList
    }
}