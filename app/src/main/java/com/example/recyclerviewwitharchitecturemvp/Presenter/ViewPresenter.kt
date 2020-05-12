package com.example.recyclerviewwitharchitecturemvp.Presenter

import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.Interface.ViewInterface

class ViewPresenter(val view : ViewInterface){
    fun loadItem(){
        val test2 = listOf(1,2,3,4,5)
        var test  = MainViewModel(1,"test",test2)
        view.updateView(test)
    }
}