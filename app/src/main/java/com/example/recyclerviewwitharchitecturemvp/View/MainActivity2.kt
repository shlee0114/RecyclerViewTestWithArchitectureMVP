package com.example.recyclerviewwitharchitecturemvp.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerviewwitharchitecturemvp.Contract.MainViewContract2
import com.example.recyclerviewwitharchitecturemvp.Model.ImageItem
import com.example.recyclerviewwitharchitecturemvp.Model.SampleImageModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.MainViewPresenter2
import com.example.recyclerviewwitharchitecturemvp.R

class MainActivity2 : AppCompatActivity(), MainViewContract2.View {

    private lateinit var presenter2 : MainViewContract2.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter2 = MainViewPresenter2().apply {
            view = this@MainActivity2
            imageModel = imageModel
        }

        presenter2.loadItems(this, false, 10)
    }

    override fun addItems(item: ArrayList<ImageItem>, isClear: Boolean) {

    }

    override fun notifyAdapter() {

    }
}