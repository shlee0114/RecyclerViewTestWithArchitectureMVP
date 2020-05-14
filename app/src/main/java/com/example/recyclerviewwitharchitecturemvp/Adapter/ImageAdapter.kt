package com.example.recyclerviewwitharchitecturemvp.Adapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.AsyncTask
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwitharchitecturemvp.Adapter.ViewHolder.ImageViewHolder
import com.example.recyclerviewwitharchitecturemvp.Model.ImageItem
import com.example.recyclerviewwitharchitecturemvp.R
import java.lang.ref.WeakReference

class ImageAdapter : RecyclerView.Adapter<ImageViewHolder>(){
    var imageList : ArrayList<ImageItem>? = null

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val item = imageList?.get(position)

        holder.imageView.setImageDrawable(item?.resource)
        //ImageAsync(holder.imageView).execute(item?.resource)
        holder.textView.text = item?.name
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "show ${item?.resource}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false))

    override fun getItemCount() = imageList?.size ?: 0

    class ImageAsync(imageView : ImageView) : AsyncTask<Int, Void, Bitmap>(){

        private val imageViewReference : WeakReference<ImageView> = WeakReference(imageView)

        override fun doInBackground(vararg params: Int?): Bitmap {
            val options = BitmapFactory.Options()
            options.inSampleSize = 2
            return BitmapFactory.decodeResource(imageViewReference.get()?.context?.resources, params[0] as Int, options)
        }

        override fun onPreExecute() {
            super.onPreExecute()
            imageViewReference.get()?.setImageResource(0)
        }

        override fun onPostExecute(result: Bitmap?) {
            super.onPostExecute(result)
            return?.let{imageViewReference.get()?.setImageBitmap(result)}
        }
    }

}