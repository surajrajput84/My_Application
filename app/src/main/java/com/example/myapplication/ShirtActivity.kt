package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ShirtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shirt)

        // Bottom navigation logic to return home
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_bar)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        // Category navigation logic
        val pantsButton = findViewById<LinearLayout>(R.id.pants_category_button)
        pantsButton.setOnClickListener {
            val intent = Intent(this, PantsActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        val jacketButton = findViewById<LinearLayout>(R.id.jacket_category_button)
        jacketButton.setOnClickListener {
            val intent = Intent(this, JacketActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        val shortsButton = findViewById<LinearLayout>(R.id.shorts_category_button)
        shortsButton.setOnClickListener {
            val intent = Intent(this, ShortsActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        val vestButton = findViewById<LinearLayout>(R.id.vest_category_button)
        vestButton.setOnClickListener {
            val intent = Intent(this, VestActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        val tshirtButton = findViewById<LinearLayout>(R.id.tshirt_category_button)
        tshirtButton.setOnClickListener {
            val intent = Intent(this, TshirtActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        // Product navigation logic
        val shirt1Button = findViewById<CardView>(R.id.shirt_1_button)
        shirt1Button.setOnClickListener {
            val intent = Intent(this, Shirt1Activity::class.java)
            startActivity(intent)
        }
        val shirt2Button = findViewById<CardView>(R.id.shirt_2_button)
        shirt1Button.setOnClickListener {
            val intent = Intent(this, Shirt2Activity::class.java)
            startActivity(intent)
        }
    }
}

