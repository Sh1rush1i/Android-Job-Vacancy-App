package com.example.pepebeem


import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
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
        val notelp = intent.getStringExtra("notelp")
        val deskripsi = intent.getStringExtra("deskripsi")
        val fotoResId = intent.getIntExtra("foto", 0)

        // Menampilkan data di TextView dan ImageView
        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val descTextView = findViewById<TextView>(R.id.descTextView)
        val notelpTextView = findViewById<TextView>(R.id.noTelpView)
        val deskripsiTextView = findViewById<TextView>(R.id.deskripsiView)
        val fotoImageView = findViewById<CircleImageView>(R.id.profile_image)

        namaTextView.text = nama
        descTextView.text = desc
        notelpTextView.text = notelp
        deskripsiTextView.text = deskripsi
        fotoImageView.setImageResource(fotoResId)
    }
}