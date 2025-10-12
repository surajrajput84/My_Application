package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class RoleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.role) // role selection layout

        val customerButton = findViewById<Button>(R.id.doctorButton)
        val adminButton = findViewById<Button>(R.id.patientButton)

        customerButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("ROLE", "customer")
            startActivity(intent)
            finish() // close RoleActivity
        }

        adminButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("ROLE", "admin")
            startActivity(intent)
            finish()
        }
    }
}
