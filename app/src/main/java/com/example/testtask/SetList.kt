package com.example.testtask

import android.app.Dialog
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ArrayAdapter
import androidx.core.view.get
import com.example.testtask.databinding.ActivityMainBinding
import com.example.testtask.databinding.ActivitySetlistBinding

class SetList : AppCompatActivity() {

    lateinit var binding: ActivitySetlistBinding
    lateinit var sharedPreferences: SharedPreferences
    //lateinit var userlist: ArrayList<String>
    //lateinit var adapter:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySetlistBinding.inflate(layoutInflater)
        val sharedPreferences=getSharedPreferences("File", MODE_PRIVATE)

        setContentView(binding.root)
        val name=sharedPreferences.getInt("File",0)


        //adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,userlist)
        //binding.lvList.adapter=adapter
        binding.btnAdd.setOnClickListener {
            var customDialog=Dialog(this)
            var dialogBinding=layoutInflater
        }
        }
    }