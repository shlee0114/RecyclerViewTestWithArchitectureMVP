package com.example.recyclerviewwitharchitecturemvp.Presenter.Interface

import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel

interface SubViewPresenterInterface {
    fun loadItem()

    interface View{
        fun updateView(item : MainViewModel)
    }
}