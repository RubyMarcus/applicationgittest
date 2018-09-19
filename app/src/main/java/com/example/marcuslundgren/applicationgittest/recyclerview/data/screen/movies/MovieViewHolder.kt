package com.example.marcuslundgren.applicationgittest.recyclerview.data.screen.movies

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.marcuslundgren.applicationgittest.R
import com.example.marcuslundgren.applicationgittest.recyclerview.data.Movie

class MovieViewHolder(itemView: View, movieClickedListener: OnMovieClicked) :RecyclerView.ViewHolder(itemView) {

    private lateinit var movie: Movie
    private val title: TextView = itemView.findViewById(R.id.movie_title_row_textview)
    private val year: TextView = itemView.findViewById(R.id.movie_year_row_textview)

    init {
        itemView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                movieClickedListener.onMovieClicked(movie)
            }
        })
    }

    fun bind(movie: Movie) {
        this.movie = movie
        title.text = movie.title
        year.text = movie.year
    }

    interface OnMovieClicked {
        fun onMovieClicked(movie: Movie)
    }

    companion object {
        fun newInstance(parent:ViewGroup, movieClickedListener: OnMovieClicked): MovieViewHolder {
            return MovieViewHolder (
                    LayoutInflater.from(parent.context).inflate(
                            R.layout.movie_row,
                            parent,
                            false
                    ),
                    movieClickedListener
            )
        }
    }
}