package com.example.pepebeem

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import de.hdodenhof.circleimageview.CircleImageView

class Profile1Activity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile1)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, ConnectionsActvity::class.java)
            startActivity(intent)
            finish()
        }

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Mengambil data ekstra dari Intent
        val nama = intent.getStringExtra("nama")
        val desc = intent.getStringExtra("desc")
        val fotoResId = intent.getIntExtra("foto", 0)

        // Menampilkan data di TextView dan ImageView
        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val descTextView = findViewById<TextView>(R.id.descTextView)
        val fotoImageView = findViewById<CircleImageView>(R.id.profile_image)

        namaTextView.text = nama
        descTextView.text = desc
        fotoImageView.setImageResource(fotoResId)
    }
}