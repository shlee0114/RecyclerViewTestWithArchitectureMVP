package com.example.recyclerviewwitharchitecturemvp.Contract

import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel

interface MainViewContract {
    interface View{
        fun updateView(list : List<MainViewModel>)
    }

    interface Presenter{
        fun setView(view: View)
        fun loadItem()
    }
}