package com.freedman.makesomethingrandom

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.freedman.makesomethingrandom.databinding.ActivityFunThingsBinding

class FunThingsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFunThingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFunThingsBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}