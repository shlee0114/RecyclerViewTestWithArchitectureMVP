package com.example.recyclerviewwitharchitecturemvp.Model

import android.content.Context
import java.util.ArrayList

class SampleImageModel {
    companion object{
        private var sampleImageModel : SampleImageModel? = null

        fun getInstance() : SampleImageModel{
            if(sampleImageModel == null)
                sampleImageModel = SampleImageModel()
            return sampleImageModel!!
        }
    }

    fun getImages(context : Context, size : Int) : ArrayList<ImageItem>{
        val items : ArrayList<ImageItem>? = ArrayList()
        for(i in 0 until size){
            val random  = (Math.random() * 15).toInt()
            val name = String.format("sample_%02d", random)
            val resource = context.resources.getIdentifier(name, "drawable", context.applicationContext.packageName)
            items!!.add(ImageItem(name, resource))
        }

        return items!!
    }
}