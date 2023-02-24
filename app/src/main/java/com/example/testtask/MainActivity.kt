package com.example.testtask

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        sharedPreferences = getSharedPreferences("File", MODE_PRIVATE)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            if (binding.etCount.text.toString().isEmpty()) {
                binding.etCount.error = "Enter Text"
            } else {
                editor = sharedPreferences.edit()
                val edit = binding.etCount.text.toString()
                editor.putInt("edit", edit.toInt())
                editor.apply()

                val intent = Intent(this, SetList::class.java)
                startActivity(intent)
            }
        }
    }
}