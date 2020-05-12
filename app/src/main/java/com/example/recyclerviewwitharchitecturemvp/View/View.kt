package com.example.recyclerviewwitharchitecturemvp.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.Interface.SubViewPresenterInterface
import com.example.recyclerviewwitharchitecturemvp.Presenter.Interface.ViewInterface
import com.example.recyclerviewwitharchitecturemvp.Presenter.SubViewPresenterImpl
import com.example.recyclerviewwitharchitecturemvp.Presenter.ViewPresenter
import com.example.recyclerviewwitharchitecturemvp.R

class View : AppCompatActivity(),ViewInterface  {

    private var presenter : ViewPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = ViewPresenter(this)
        presenter!!.loadItem()
    }

    override fun updateView(item: MainViewModel) {

    }
}