package com.example.courseraassignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var photo: ImageView?=null
    var education:Button?=null
    var work:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        photo=findViewById(R.id.tonyImage)
        photo?.setOnClickListener({
            var clickIntent=Intent(this,fullPic::class.java)
            startActivity(clickIntent)
        })


    }
}