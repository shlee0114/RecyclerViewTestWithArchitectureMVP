package com.example.recyclerviewwitharchitecturemvp.Presenter

import com.example.recyclerviewwitharchitecturemvp.Contract.MainViewContract
import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel

class MainViewPresenter : MainViewContract.Presenter {

    private var view : MainViewContract.View? = null

    override fun loadItem(){
        val test2 = listOf(1,2,3,4,5)

        var test : List<MainViewModel> =listOf(MainViewModel(1,"test",test2))
        view!!.updateView(test)
    }

    override fun setView(view: MainViewContract.View) {
        this.view = view;
    }

}