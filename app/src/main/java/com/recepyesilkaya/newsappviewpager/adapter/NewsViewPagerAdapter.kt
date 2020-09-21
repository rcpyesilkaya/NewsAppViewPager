package com.recepyesilkaya.newsappviewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.recepyesilkaya.newsappviewpager.model.FragmentModel

class NewsViewPagerAdapter(
    private val fragmentlist: List<FragmentModel>,
    fragmentManager: FragmentManager
) : FragmentStatePagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int =
        fragmentlist.size


    override fun getItem(position: Int): Fragment =
        fragmentlist[position].fragment

    override fun getPageTitle(position: Int): CharSequence? =
        fragmentlist[position].title
}