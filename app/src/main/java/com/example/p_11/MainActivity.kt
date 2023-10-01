package com.example.p_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView2 = findViewById(R.id.imageView2)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
// Установить изображение в ImageView
            imageView2.setImageResource(R.drawable.dr)
        }

    }



}