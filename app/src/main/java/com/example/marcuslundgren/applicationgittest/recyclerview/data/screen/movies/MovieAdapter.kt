package com.example.marcuslundgren.applicationgittest.recyclerview.data.screen.movies

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.marcuslundgren.applicationgittest.recyclerview.data.Movie

class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {

    private var onMovieClickListener: MovieViewHolder.OnMovieClicked? = null
    private var movies: List<Movie> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, type: Int): MovieViewHolder {
        return MovieViewHolder.newInstance(parent, onMovieClickListener!!)
    }

    override fun onBindViewHolder(movieViewHolder: MovieViewHolder, position: Int) {
        movieViewHolder.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun setMovies(movies:List<Movie>) {
        this.movies = movies
        notifyDataSetChanged()
    }

    fun setOnMovieClickListener (onMovieClickListener: MovieViewHolder.OnMovieClicked) {
        this.onMovieClickListener = onMovieClickListener
    }
}