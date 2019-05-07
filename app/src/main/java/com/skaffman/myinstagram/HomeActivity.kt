package com.skaffman.myinstagram

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(0) {
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupBottomNavigation()
        Log.d(TAG, "onCreate")
    }
}
