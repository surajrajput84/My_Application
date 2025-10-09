package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Shirt1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shirt1)

        // Find the back button by its ID
        val backButton = findViewById<ImageButton>(R.id.back_button)

        // Set a click listener on the button
        backButton.setOnClickListener {
            // The finish() method closes the current activity and returns to the previous one
            finish()
        }
    }
}

