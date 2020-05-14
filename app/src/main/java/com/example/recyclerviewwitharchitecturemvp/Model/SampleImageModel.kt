package com.example.recyclerviewwitharchitecturemvp.Model

import android.content.Context
import java.util.ArrayList

object SampleImageModel {

    fun getImages(context : Context, size : Int) : ArrayList<ImageItem>{
        val items = ArrayList<ImageItem>()
        for(i in 0..size){
            val name = String.format("@drawable/sample_%02d", (Math.random() * 15).toInt())
            val resource = context.resources.getDrawable(context.resources.getIdentifier(name, "drawable", context.packageName), null)
            items.add(ImageItem(name, resource))
        }
        return items
    }
}