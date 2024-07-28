package com.freedman.makesomethingrandom

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.freedman.makesomethingrandom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setOnClickListeners()

    }

    private fun setOnClickListeners() {
        binding.cardView1.setOnClickListener {
            //send to somewhere
            val playGameIntent = Intent(this, PlayGamesActivity::class.java)
            startActivity(playGameIntent)
        }

        binding.cardView2.setOnClickListener {
            //send to somewhere else
            //need to send to a different Activity
            val funThingsIntent = Intent(this, FunThingsActivity::class.java)
            startActivity(funThingsIntent)
        }
    }
}