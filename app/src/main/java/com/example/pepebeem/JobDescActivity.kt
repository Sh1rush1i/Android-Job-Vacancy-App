package com.example.pepebeem


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class JobDescActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.desc_job)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }

        val homeBtn = findViewById<ImageView>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Mengambil data ekstra dari Intent
        val nama = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("deskripsi")
        val gaji = intent.getStringExtra("gaji")
        val fotoResId = intent.getIntExtra("foto", 0)


        // Menampilkan data di TextView dan ImageView
        val namaTextView = findViewById<TextView>(R.id.job)
        val deskripsiTextView = findViewById<TextView>(R.id.deskripsiView)
        val gajiTextView = findViewById<TextView>(R.id.gajiView)
        val fotoImageView = findViewById<ImageView>(R.id.jobImg)

        namaTextView.text = nama
        deskripsiTextView.text = deskripsi
        gajiTextView.text = gaji
        fotoImageView.setImageResource(fotoResId)
    }
}