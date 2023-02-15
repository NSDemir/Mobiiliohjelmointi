package com.example.mobharj1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

      var number= 0
      var reset = 0


// sain laskurin toimimaan mutten saanut reset buttonia toimimaan

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.VisAmount)

        var b1 = findViewById<Button>(R.id.AddButton)
        var b2 = findViewById<Button>(R.id.DecButton)

            b1.setOnClickListener {
            number++
            tv.setText("$number")

                 b2.setOnClickListener {
                 number--
                 tv.setText("$number")
}}}}

