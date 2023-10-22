package com.example.pepebeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import androidx.core.view.WindowCompat


class JobActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.job)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val backEdit = findViewById<ImageView>(R.id.backEdit)
        backEdit.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()

        }

        val notif = findViewById<ImageView>(R.id.notificationbtn)
        notif.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }}