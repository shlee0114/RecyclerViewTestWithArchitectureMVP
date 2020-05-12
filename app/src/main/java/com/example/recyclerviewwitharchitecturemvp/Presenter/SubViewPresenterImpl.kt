package com.example.recyclerviewwitharchitecturemvp.Presenter

import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.Interface.SubViewPresenterInterface

class SubViewPresenterImpl (val view : SubViewPresenterInterface.View) : SubViewPresenterInterface{

    override fun loadItem() {
        val test2 = listOf(1,2,3,4,5)
        var test  =MainViewModel(1,"test",test2)
        view.updateView(test)
    }
}