package com.example.marcuslundgren.applicationgittest.recyclerview.data.screen.movies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.marcuslundgren.applicationgittest.R
import com.example.marcuslundgren.applicationgittest.recyclerview.data.Movie
import com.example.marcuslundgren.applicationgittest.recyclerview.data.MovieRepository
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        movie_recyclerview.setHasFixedSize(true)

        movie_recyclerview.layoutManager = LinearLayoutManager(this)

        val movies = MovieRepository().get()
        val adapter = MovieAdapter()
        adapter.setOnMovieClickListener(object : MovieViewHolder.OnMovieClicked{
            override fun onMovieClicked(movie: Movie) {
                println(movie)
            }

        })
        adapter.setMovies(movies)

        movie_recyclerview.adapter = adapter
    }
}
