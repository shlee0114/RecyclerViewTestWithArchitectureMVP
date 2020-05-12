package com.example.recyclerviewwitharchitecturemvp.Adapter.ViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwitharchitecturemvp.R

class ImageViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
    val imageView by lazy {
        itemView.findViewById(R.id.img_view) as ImageView
    }
    val textView by lazy {
        itemView.findViewById(R.id.text) as TextView
    }
}