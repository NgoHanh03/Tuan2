package com.example.myapplication.Tuan22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R

class Tuan22MainActivity : AppCompatActivity() {
    var txt1: EditText? = null;
    var txt2: EditText? = null;
    var btn1: Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_main2)
        txt1=findViewById(R.id.tuan22txt1)
        txt2=findViewById(R.id.tuan22txt2)
        btn1=findViewById(R.id.tuan22btn1)
        btn1!!.setOnClickListener(View.OnClickListener {
            var i=Intent(this@Tuan22MainActivity,
                tuan22secondActivity::class.java)
            i.putExtra("so1", txt1!!.text.toString())
            i.putExtra("so2", txt2!!.text.toString())
            startActivity(i)
        })
    }
}