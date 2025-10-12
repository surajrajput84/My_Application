package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<MaterialButton>(R.id.loginButton)

        // Dummy credentials
        val correctUsername = "suraj"
        val correctPassword = "34"

        loginButton.setOnClickListener {
            val enteredUsername = emailEditText.text.toString().trim()
            val enteredPassword = passwordEditText.text.toString().trim()

            if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
                Toast.makeText(this, "Please enter all fields", Toast.LENGTH_SHORT).show()
            } else if (enteredUsername == correctUsername && enteredPassword == correctPassword) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
