package com.example.moviesrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter(var list:ArrayList<MovieData>) : RecyclerView.Adapter<MoviesAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var img:ImageView=itemView.findViewById(R.id.mvi)
        var movieName:TextView=itemView.findViewById(R.id.mvt)
        var movieHero:TextView=itemView.findViewById(R.id.mvh)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val View=LayoutInflater.from(parent.context).inflate(R.layout.single_row,parent,false)
        return MyViewHolder(View)
    }

    override fun getItemCount(): Int {
       return  list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var data=list[position]
        holder.movieHero.text=data.heroName
        holder.movieName.text=data.movieName
        holder.img.setImageResource(list[position].moviePoster)

    }
}