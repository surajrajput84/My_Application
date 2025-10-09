package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class PantsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pant)

        // --- Bottom Navigation Logic ---
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

        // --- Category Navigation Logic ---
        findViewById<LinearLayout>(R.id.shirt_category_button).setOnClickListener {
            startActivity(Intent(this, ShirtActivity::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.jacket_category_button).setOnClickListener {
            startActivity(Intent(this, JacketActivity::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.shorts_category_button).setOnClickListener {
            startActivity(Intent(this, ShortsActivity::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.vest_category_button).setOnClickListener {
            startActivity(Intent(this, VestActivity::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.tshirt_category_button).setOnClickListener {
            startActivity(Intent(this, TshirtActivity::class.java))
            finish()
        }
    }
}

