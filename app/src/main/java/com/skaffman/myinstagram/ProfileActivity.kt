package com.skaffman.myinstagram

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : BaseActivity(4) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setupBottomNavigation()

        edit_profile_btn.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
