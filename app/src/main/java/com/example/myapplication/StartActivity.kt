package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)

        val startButton = findViewById<MaterialCardView>(R.id.startButtonContainer)

        startButton.setOnClickListener {
            val intent = Intent(this, RoleActivity::class.java)
            startActivity(intent)
            finish() // finish StartActivity so back press won't return here
        }
    }
}
