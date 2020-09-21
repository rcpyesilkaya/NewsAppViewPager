package com.recepyesilkaya.newsappviewpager.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsModel(
    val newsName:String,
    val image:String
) : Parcelable