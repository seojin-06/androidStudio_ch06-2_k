package com.cookandroid.project_k_6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.project_k_6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            binding.vf1.startFlipping()
            binding.vf1.flipInterval = 1000
        }

        binding.btnStop.setOnClickListener {
            binding.vf1.stopFlipping()
        }
    }
}