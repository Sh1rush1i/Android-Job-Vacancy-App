package com.example.pepebeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.WindowCompat


class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.review)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }}