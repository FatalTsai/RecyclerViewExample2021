package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView





class ExapmleAdapter(private  val examplelist :List<ExampleItem>) : RecyclerView.Adapter<ExapmleAdapter.ExampleViewHolder>() {
    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



        val  imageView : ImageView = itemView.findViewById(R.id.image_view)
        val  textView1 : TextView = itemView.findViewById(R.id.text_view_1)
        val  textView2 : TextView = itemView.findViewById(R.id.text_view_2)

    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = examplelist[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2


    }

    override fun getItemCount() = examplelist.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_itme,parent,false)
        return  ExampleViewHolder(itemView)
    }


}