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

class SocmedActivity  : AppCompatActivity() {
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
            "Spotify",
            "X",
            "Instagram",
            "Steam",
            "Discord"
            )

        val desc = arrayOf<String>(
            "Shirushi",
            "Account Suspended",
            "if.sh1rush1",
            "⋆シルシ⋆™",
            "shirushi._"
            )

        val fotofoto = arrayOf<Int>(
            R.drawable.spotify,
            R.drawable.twitter,
            R.drawable.insta,
            R.drawable.steam,
            R.drawable.dc
        )

        // definisi list view
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->

            if (position==0){
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, WebViewActivity::class.java)
                intent.putExtra("url", "https://open.spotify.com/user/fxgildus2mf3ljrgb4egkzu4g")
                startActivity(intent)
            }

            if (position==1){
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, WebViewActivity::class.java)
                intent.putExtra("url", "https://twitter.com/sh1rush1")
                startActivity(intent)
            }

            if (position==2){
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, WebViewActivity::class.java)
                intent.putExtra("url", "https://www.instagram.com/if.sh1rush1/")
                startActivity(intent)
            }

            if (position==3){
                // Handle action for position 1 (open web preview in WebViewActivity)
                val intent = Intent(this, WebViewActivity::class.java)
                intent.putExtra("url", "https://steamcommunity.com/id/sh1rush1")
                startActivity(intent)
            }

            if (position==4){
                val clipboardText = desc.getOrNull(position) ?: ""
                if (clipboardText.isNotEmpty()) {
                    copyToClipboard(clipboardText)
                    Toast.makeText(this, "Discord username copied to clipboard", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }

    private fun copyToClipboard(text: String) {
        val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("Copied Text", text)
        clipboardManager.setPrimaryClip(clipData)
    }}