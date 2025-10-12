package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Shirt2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shirt2)

        val backButton = findViewById<ImageButton>(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }
    }
}
