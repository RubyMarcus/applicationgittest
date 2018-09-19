package com.example.marcuslundgren.applicationgittest.screen.splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.marcuslundgren.applicationgittest.MainActivity
import com.example.marcuslundgren.applicationgittest.recyclerview.data.screen.movies.MoviesActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, MoviesActivity::class.java)
        startActivity(intent)
    }
}
