package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class trouserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trouser)

        // Find the back button by its ID
        val backButton = findViewById<ImageButton>(R.id.back_button)


        backButton.setOnClickListener {

            finish()
        }
    }
}