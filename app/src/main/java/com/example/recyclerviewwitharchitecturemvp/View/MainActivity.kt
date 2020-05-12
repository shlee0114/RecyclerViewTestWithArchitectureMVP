package com.example.recyclerviewwitharchitecturemvp.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.recyclerviewwitharchitecturemvp.Contract.MainViewContract
import com.example.recyclerviewwitharchitecturemvp.Model.MainViewModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.MainViewPresenter
import com.example.recyclerviewwitharchitecturemvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainViewContract.View {

    private var presenter : MainViewContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainViewPresenter()
        presenter!!.setView(this)
        presenter!!.loadItem()
        test.setOnClickListener {
            var i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }

    override fun updateView(list: List<MainViewModel>) {
        Log.d("TEST", list.get(0).test.toString())
    }
}
