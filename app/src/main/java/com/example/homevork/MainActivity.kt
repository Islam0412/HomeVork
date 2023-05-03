package com.example.homevork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homevork.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var adapter : AdapterViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = AdapterViewPager(this)
        binding.viewPager2.adapter = adapter

    }
}