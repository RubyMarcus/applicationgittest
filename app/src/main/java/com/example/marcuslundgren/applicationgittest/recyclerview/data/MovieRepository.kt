package com.example.marcuslundgren.applicationgittest.recyclerview.data

class MovieRepository {
    fun get():List<Movie>{
        return arrayOf(
                Movie("Crime", "2009"),
                Movie("Drama", "2005"),
                Movie("Action", "2003"),
                Movie("Comedy", "2001"),
                Movie("Thriller", "2010"),
                Movie("Fantasy", "2009"),
                Movie("Crime", "2009")
        ).toList()
    }
}