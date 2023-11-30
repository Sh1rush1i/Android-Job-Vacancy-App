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
        setContentView(R.layout.connections)

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
        val fotofoto1 = arrayOf<Int>(
            R.drawable.circularbordersolid,
            R.drawable.circularbordersolid,
            R.drawable.circularbordersolid,
            R.drawable.circularbordersolid,
            R.drawable.circularbordersolid
        )
        val noTelp = arrayOf<String>(
            "+62 234789654",
            "+62 908745634",
            "+62 876785679",
            "+62 476329874",
            "+62 765904561"
        )
        val none1 = arrayOf<String>(
            "",
            "",
            "",
            "",
            ""
        )
        val Deskripsi = arrayOf<String>(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio."
        )
        val list1 = findViewById<ListView>(R.id.listview1)
        list1.adapter = listAdapter(this, noTelp, fotofoto1 , none1 )
        list1.setOnItemClickListener { adapterView, view, position, id ->
            val clipboardText = desc.getOrNull(position) ?: ""
            if (clipboardText.isNotEmpty()) {
                copyToClipboard(clipboardText)
                Toast.makeText(this, "Contact number copied to clipboard", Toast.LENGTH_SHORT).show()
            }
        }
        // definisi list view
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this, Profile1Activity::class.java)
            // Menyertakan data ekstra ke Intent
            intent.putExtra("nama", namanama[position])
            intent.putExtra("desc", desc[position])
            intent.putExtra("foto", fotofoto[position])
            intent.putExtra("notelp", noTelp[position])
            intent.putExtra("deskripsi", Deskripsi[position])
            // Memulai aktivitas dengan Intent yang dikonfigurasi
            startActivity(intent)
        }
    }
    private fun copyToClipboard(text: String) {
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("Copied Text", text)
        clipboardManager.setPrimaryClip(clipData)
    }
}