package com.example.myapplication.Tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.R

class Tuan22Main3Activity : AppCompatActivity() {
    var lv: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main3)
        lv = findViewById(R.id.Tuan22Lv)
        val arr = arrayOf("so1", "so2", "so3", "aaa", "bbb", "ccc")
        val ad=ArrayAdapter(this,
            android.R.layout.simple_list_item_1, arr)
        lv!!.adapter=ad
    }
}