package com.premier.cm.onlines.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val card1:CardView=findViewById(R.id.c1)


        card1.setOnClickListener{
            Toast.makeText(this,"you have selected adding a new Task",Toast.LENGTH_LONG).show()
        }
    }
}