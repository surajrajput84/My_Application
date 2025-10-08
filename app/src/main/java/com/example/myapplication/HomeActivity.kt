package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        // Find category buttons by their IDs
        val shirtButton = findViewById<LinearLayout>(R.id.shirt_category_button)
        val pantsButton = findViewById<LinearLayout>(R.id.pants_category_button)
        val jacketButton = findViewById<LinearLayout>(R.id.jacket_category_button)
        val shortsButton = findViewById<LinearLayout>(R.id.shorts_category_button)
        val vestButton = findViewById<LinearLayout>(R.id.vest_category_button)
        val tshirtButton = findViewById<LinearLayout>(R.id.tshirt_category_button)

        // Set click listeners for each category button
        shirtButton.setOnClickListener {
            startActivity(Intent(this, ShirtActivity::class.java))
        }
        pantsButton.setOnClickListener {
            startActivity(Intent(this, PantsActivity::class.java))
        }
        jacketButton.setOnClickListener {
            startActivity(Intent(this, JacketActivity::class.java))
        }
        shortsButton.setOnClickListener {
            startActivity(Intent(this, ShortsActivity::class.java))
        }
        vestButton.setOnClickListener {
            startActivity(Intent(this, VestActivity::class.java))
        }
        tshirtButton.setOnClickListener {
            startActivity(Intent(this, TshirtActivity::class.java))
        }

        // Handle Bottom Navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_bar)
        bottomNavigationView.selectedItemId = R.id.navigation_home // Set home as selected
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                // R.id.navigation_home -> true // Already on the home screen, do nothing.
                // You can add navigation to other screens here if needed
                else -> false
            }
        }
    }
}

