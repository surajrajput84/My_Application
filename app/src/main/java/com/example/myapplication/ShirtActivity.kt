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

        // Category Buttons
        val pantsButton = findViewById<LinearLayout>(R.id.pants_category_button)
        val jacketButton = findViewById<LinearLayout>(R.id.jacket_category_button)
        val shortsButton = findViewById<LinearLayout>(R.id.shorts_category_button)
        val vestButton = findViewById<LinearLayout>(R.id.vest_category_button)
        val tshirtButton = findViewById<LinearLayout>(R.id.tshirt_category_button)

        pantsButton.setOnClickListener {
            startActivity(Intent(this, PantsActivity::class.java))
            finish()
        }
        jacketButton.setOnClickListener {
            startActivity(Intent(this, JacketActivity::class.java))
            finish()
        }
        shortsButton.setOnClickListener {
            startActivity(Intent(this, ShortsActivity::class.java))
            finish()
        }
        vestButton.setOnClickListener {
            startActivity(Intent(this, VestActivity::class.java))
            finish()
        }
        tshirtButton.setOnClickListener {
            startActivity(Intent(this, TshirtActivity::class.java))
            finish()
        }

        // Product Cards
        val shirt1Button = findViewById<CardView>(R.id.shirt_1_button)
        val shirt2Button = findViewById<CardView>(R.id.shirt_2_button)

        shirt1Button.setOnClickListener { startActivity(Intent(this, Shirt1Activity::class.java)) }
        shirt2Button.setOnClickListener { startActivity(Intent(this, Shirt2Activity::class.java)) }
    }
}
