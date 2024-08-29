package com.example.recyclerproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class BooksAdapter(val books :List<Book>):RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {
    class BooksViewHolder(val row:View):RecyclerView.ViewHolder(row){
val tv1=row.findViewById<TextView>(R.id.name)
        val tv2=row.findViewById<TextView>(R.id.by)
        val iv=row.findViewById<ImageView>(R.id.imagee)
        var rate=row.findViewById<RatingBar>(R.id.book_rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val layout=LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return BooksViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
val book=books.get(position)
holder.tv1.text=book.name
        holder.tv2.text=book.by
        holder.iv.setImageResource(book.imageId)
holder.rate.rating= book.rating.toFloat()
    }
}