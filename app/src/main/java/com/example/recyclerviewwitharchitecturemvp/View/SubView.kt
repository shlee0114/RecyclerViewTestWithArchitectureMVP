package com.example.recyclerviewwitharchitecturemvp.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.Interface.SubViewPresenterInterface
import com.example.recyclerviewwitharchitecturemvp.Presenter.SubViewPresenterImpl
import com.example.recyclerviewwitharchitecturemvp.R

class SubView : AppCompatActivity(), SubViewPresenterInterface.View {

    private var presenter : SubViewPresenterImpl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = SubViewPresenterImpl(this)
        presenter!!.loadItem()
    }

    override fun updateView(item: MainViewModel) {

    }
}