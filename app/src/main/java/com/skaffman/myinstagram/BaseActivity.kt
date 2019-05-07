package com.skaffman.myinstagram

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_home.*

abstract class BaseActivity(val navNumber: Int) : AppCompatActivity() {
    fun setupBottomNavigation() {
        bottom_navigation_view.setIconSize(29f, 29f)
        bottom_navigation_view.setTextVisibility(false)
        bottom_navigation_view.enableItemShiftingMode(false)
        bottom_navigation_view.enableShiftingMode(false)
        bottom_navigation_view.enableAnimation(false)
        for (i in 0 until bottom_navigation_view.menu.size()) bottom_navigation_view.setIconTintList(i, null)

        bottom_navigation_view.setOnNavigationItemSelectedListener {
            val nextActivity = when (it.itemId) {
                R.id.nav_item_home -> HomeActivity::class.java
                R.id.nav_item_likes -> LikesActivity::class.java
                R.id.nav_item_profile -> ProfileActivity::class.java
                R.id.nav_item_search -> SearchActivity::class.java
                R.id.nav_item_share -> ShareActivity::class.java
                else -> {
//                    Log.e(TAG, "Unknown nav item clicked $it")
                    null
                }
            }

            if (nextActivity != null) {
                val intent = Intent(this, nextActivity)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(intent)
                overridePendingTransition(0, 0)
                true
            } else {
                false
            }
        }

        bottom_navigation_view.menu.getItem(navNumber).isChecked = true
    }
}