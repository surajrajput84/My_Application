package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout

// 1. Inherit from BaseActivity instead of AppCompatActivity
class HomeActivity : BaseActivity() {

    // 2. Specify which navigation item should be selected for this screen
    override val selectedNavItemId: Int = R.id.navigation_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        // Your existing click listeners for categories remain the same
        val shirtButton = findViewById<LinearLayout>(R.id.shirt_category_button)
        val pantsButton = findViewById<LinearLayout>(R.id.pants_category_button)
        val jacketButton = findViewById<LinearLayout>(R.id.jacket_category_button)
        val shortsButton = findViewById<LinearLayout>(R.id.shorts_category_button)
        val vestButton = findViewById<LinearLayout>(R.id.vest_category_button)
        val tshirtButton = findViewById<LinearLayout>(R.id.tshirt_category_button)

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
        // Assuming you have VestActivity, create it if you haven't
        vestButton.setOnClickListener {
            // startActivity(Intent(this, VestActivity::class.java))
        }
        tshirtButton.setOnClickListener {
            startActivity(Intent(this, TshirtActivity::class.java))
        }

        // 3. Delete all the old BottomNavigationView code from here.
        // BaseActivity now handles it automatically.
    }
}