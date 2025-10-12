package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        // Category Buttons
        val shirtButton = findViewById<LinearLayout>(R.id.shirt_category_button)
        val pantsButton = findViewById<LinearLayout>(R.id.pants_category_button)
        val jacketButton = findViewById<LinearLayout>(R.id.jacket_category_button)
        val shortsButton = findViewById<LinearLayout>(R.id.shorts_category_button)
        val vestButton = findViewById<LinearLayout>(R.id.vest_category_button)
        val tshirtButton = findViewById<LinearLayout>(R.id.tshirt_category_button)

        // Product Cards
        val shirtCard = findViewById<CardView>(R.id.shirt_1_button)
        val trouserCard = findViewById<CardView>(R.id.trouser_button)

        // Category Clicks
        shirtButton.setOnClickListener { startActivity(Intent(this, ShirtActivity::class.java)) }
        pantsButton.setOnClickListener { startActivity(Intent(this, PantsActivity::class.java)) }
        jacketButton.setOnClickListener { startActivity(Intent(this, JacketActivity::class.java)) }
        shortsButton.setOnClickListener { startActivity(Intent(this, ShortsActivity::class.java)) }
        vestButton.setOnClickListener { startActivity(Intent(this, VestActivity::class.java)) }
        tshirtButton.setOnClickListener { startActivity(Intent(this, TshirtActivity::class.java)) }

        // Product Card Clicks
        shirtCard.setOnClickListener { startActivity(Intent(this, ShirtActivity::class.java)) }
        trouserCard.setOnClickListener { startActivity(Intent(this, trouserActivity::class.java)) }
    }
}
