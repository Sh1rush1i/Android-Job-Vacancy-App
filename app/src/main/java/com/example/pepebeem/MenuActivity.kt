package com.example.pepebeem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.WindowCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val prflPic = findViewById<ImageView>(R.id.imageView4)
        prflPic.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()}

        val reviewbtn = findViewById<ImageView>(R.id.reviewbtn)
        reviewbtn.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
            finish()}

        val reviewtxt = findViewById<TextView>(R.id.reviewtxt)
        reviewtxt.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
            finish()}

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()}

        val notificationtxt = findViewById<TextView>(R.id.notificationtxt)
        notificationtxt.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()}

        val jobimg = findViewById<ImageView>(R.id.jobimg)
        jobimg.setOnClickListener {
            val intent = Intent(this, JobActivity::class.java)
            startActivity(intent)
            finish()}

        val jobbtn = findViewById<TextView>(R.id.jobBtn)
        jobbtn.setOnClickListener {
            val intent = Intent(this, JobActivity::class.java)
            startActivity(intent)
            finish()}



        NavigationBarView.OnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.homeNav -> {
                    // Respond to navigation item 1 click
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true

                }
                R.id.job_nav -> {
                    // Respond to navigation item 2 click
                    true
                }

                R.id.profileNav -> {
                    // Respond to navigation item 2 click
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }


                else -> false
            }
        }
    }}