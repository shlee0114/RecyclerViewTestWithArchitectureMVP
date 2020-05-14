package com.example.recyclerviewwitharchitecturemvp.Contract

import android.content.Context
import com.example.recyclerviewwitharchitecturemvp.Model.ImageItem
import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel
import com.example.recyclerviewwitharchitecturemvp.Model.SampleImageModel

interface MainViewContract2 {
    interface View{
        fun addItems(item : ArrayList<ImageItem>, isClear : Boolean)
        fun notifyAdapter()
    }

    interface Presenter{
        fun loadItems(context : Context, isClear: Boolean, size : Int)
    }

}