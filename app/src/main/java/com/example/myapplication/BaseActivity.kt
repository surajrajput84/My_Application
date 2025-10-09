package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

abstract class BaseActivity : AppCompatActivity() {

    // This property will be overridden by child activities
    // to indicate which navigation item should be selected.
    @get:IdRes
    protected abstract val selectedNavItemId: Int

    override fun onStart() {
        super.onStart()
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        // Find the BottomNavigationView in the layout. Using '?' handles cases
        // where an activity's layout doesn't include the navigation bar.
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_bar)

        bottomNavigationView?.let { navView ->
            navView.selectedItemId = selectedNavItemId

            navView.setOnItemSelectedListener { item ->
                // Do nothing if the selected item is the current screen
                if (item.itemId == selectedNavItemId) {
                    return@setOnItemSelectedListener false
                }

                // Navigate to the corresponding activity
                val intent = when (item.itemId) {
                    R.id.navigation_home -> Intent(this, HomeActivity::class.java)
                    // TODO: Add intents for your other navigation items here
                    // R.id.navigation_cart -> Intent(this, CartActivity::class.java)
                    // R.id.navigation_favorites -> Intent(this, FavoritesActivity::class.java)
                    // R.id.navigation_profile -> Intent(this, ProfileActivity::class.java)
                    else -> null
                }

                intent?.let {
                    // These flags clear the activity stack and bring the existing activity to the front
                    it.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                    startActivity(it)
                }

                // Return true to display the item as the selected item
                true
            }
        }
    }
}