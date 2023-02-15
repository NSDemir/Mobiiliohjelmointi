package com.example.h1t2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var currentImage = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val nextButton: Button = findViewById(R.id.NextButton)
        val prevButton: Button = findViewById(R.id.PrevButton)

        val images = arrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)

        nextButton.setOnClickListener {
            currentImage++
            if (currentImage == images.size) {
                currentImage = 0
            }
            imageView.setImageResource(images[currentImage])
        }

        prevButton.setOnClickListener {
            currentImage--
            if (currentImage < 0) {
                currentImage = images.size - 1
            }
            imageView.setImageResource(images[currentImage])
        }
    }
}
