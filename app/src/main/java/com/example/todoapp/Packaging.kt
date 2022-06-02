package com.example.todoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todoapp.databinding.ActivityMainBinding
import com.example.todoapp.databinding.PackagingBinding

class Packaging : AppCompatActivity(){
    private lateinit var binding: PackagingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PackagingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.

    }
}