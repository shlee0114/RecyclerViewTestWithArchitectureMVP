package com.example.recyclerviewwitharchitecturemvp.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.recyclerviewwitharchitecturemvp.Contract.MainViewContract
import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.MainViewPresenter
import com.example.recyclerviewwitharchitecturemvp.R

class MainActivity : AppCompatActivity(), MainViewContract.View {

    private var presenter : MainViewContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainViewPresenter()
        presenter!!.setView(this)
        presenter!!.loadItem()
    }

    override fun updateView(list: List<MainViewModel>) {
        Log.d("TEST", list.get(0).test.toString())
    }
}
