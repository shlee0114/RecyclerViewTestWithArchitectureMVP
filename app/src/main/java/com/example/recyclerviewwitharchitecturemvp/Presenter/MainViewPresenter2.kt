package com.example.recyclerviewwitharchitecturemvp.Presenter

import android.content.Context
import com.example.recyclerviewwitharchitecturemvp.Contract.MainViewContract2
import com.example.recyclerviewwitharchitecturemvp.Model.SampleImageModel

class MainViewPresenter2(
    val imageModel: SampleImageModel,
    val view: MainViewContract2.View
) : MainViewContract2.Presenter {


    override fun loadItems(context: Context, isClear: Boolean, size : Int) {
        imageModel.getImages(context, size).let{
            view.addItems(it, isClear)
            view.notifyAdapter()
        }
    }
}