package com.example.activityrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecyclerAdapter(private val mMovies : List<MainActivity.Movie>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImage : ImageView = itemView.findViewById<ImageView>(R.id.movieImage)
        val movieTitle : TextView = itemView.findViewById<TextView>(R.id.movieTitle)
        val movieDirector : TextView = itemView.findViewById<TextView>(R.id.movieDirector)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent?.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.movie_container, parent, false)

        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return mMovies.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie : MainActivity.Movie = mMovies[position]

        Picasso.get().load(movie.image).into(holder.movieImage)
        holder.movieTitle.text = movie.title
        holder.movieDirector.text = movie.director
    }
}