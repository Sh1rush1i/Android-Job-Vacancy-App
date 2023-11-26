package com.example.pepebeem

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class ConnectionsActvity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.socmed)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }

        // siapin variable array yang mempunyai nilai
        val namanama = arrayOf<String>(
            "Freddy Fazbear",
            "Wilson",
            "Adam",
            "Bill",
            "El Gato"
            )

        val desc = arrayOf<String>(
            "CEO of Meme Lord",
            "Human Resource of Water Inc.",
            "Professional Swimmer",
            "CEO of Mining Company",
            "Vet"
            )

        val fotofoto = arrayOf<Int>(
            R.drawable.fazbear,
            R.drawable.wilson,
            R.drawable.fit,
            R.drawable.bill,
            R.drawable.elgato
        )

        // definisi list view
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this, Profile1Activity::class.java)

            // Menyertakan data ekstra ke Intent
            intent.putExtra("nama", namanama[position])
            intent.putExtra("desc", desc[position])
            intent.putExtra("foto", fotofoto[position])

            // Memulai aktivitas dengan Intent yang dikonfigurasi
            startActivity(intent)
        }
    }
}