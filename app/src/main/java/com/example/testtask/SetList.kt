package com.example.testtask

import android.app.Dialog
import android.content.ClipData.Item
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.core.view.get
import com.example.testtask.databinding.ActivityMainBinding
import com.example.testtask.databinding.ActivitySetlistBinding
import java.io.File

class SetList : AppCompatActivity() {

    lateinit var binding: ActivitySetlistBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var adapter:ArrayAdapter<String>
    var array = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySetlistBinding.inflate(layoutInflater)
        val sharedPreferences=getSharedPreferences("File", MODE_PRIVATE)

        setContentView(binding.root)

        val name=sharedPreferences.getInt("File", Int.MIN_VALUE)
       // var array= arrayOf("1","2","3","4","5")
        //for loop
        adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,array)
        binding.lvList.adapter=adapter


        binding.lvList.setOnItemClickListener { adapterView, view, i, l ->
            val dialogBinding=layoutInflater.inflate(R.layout.customdialog,null)
            val mydialog=Dialog(this)
            mydialog.setContentView(dialogBinding)
            mydialog.setCancelable(true)
            mydialog.show()
        }

        }
        }
