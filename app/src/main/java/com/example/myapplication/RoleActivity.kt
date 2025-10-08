package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class RoleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.role)

        val ownerButton = findViewById<MaterialButton>(R.id.doctorButton)
        val userButton = findViewById<MaterialButton>(R.id.patientButton)

        ownerButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("ROLE", "Owner")
            startActivity(intent)
            finish() // finish RoleActivity to prevent going back to it
        }

        userButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("ROLE", "User")
            startActivity(intent)
            finish() // finish RoleActivity to prevent going back to it
        }
    }
}
