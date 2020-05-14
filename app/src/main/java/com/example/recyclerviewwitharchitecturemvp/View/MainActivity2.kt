package com.example.recyclerviewwitharchitecturemvp.View

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwitharchitecturemvp.Adapter.ImageAdapter
import com.example.recyclerviewwitharchitecturemvp.Contract.MainViewContract2
import com.example.recyclerviewwitharchitecturemvp.Model.ImageItem
import com.example.recyclerviewwitharchitecturemvp.Model.SampleImageModel
import com.example.recyclerviewwitharchitecturemvp.Presenter.MainViewPresenter2
import com.example.recyclerviewwitharchitecturemvp.R

class MainActivity2 : AppCompatActivity(), MainViewContract2.View {

    private val recyclerView by lazy {
        findViewById<RecyclerView>(R.id.recycler_view)
    }

    private val imageAdapter by lazy {
        ImageAdapter()
    }

    private lateinit var presenter2 : MainViewPresenter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_recycler_view)
        presenter2 = MainViewPresenter2(
            view = this@MainActivity2,
            imageModel = SampleImageModel
        )

        recyclerView.adapter = imageAdapter


        presenter2.loadItems(this, false, 10)
    }

    override fun addItems(item: ArrayList<ImageItem>, isClear: Boolean) {
        imageAdapter?.apply {
            if(isClear)
                imageList?.clear()
            imageList = item
        }
    }

    override fun notifyAdapter() {
        imageAdapter?.notifyDataSetChanged()
    }
}