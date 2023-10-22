package com.example.pepebeem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.karikari.goodpinkeypad.GoodPinKeyPad
import com.karikari.goodpinkeypad.KeyPadListerner


class PinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pininput)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val keyPad = findViewById<GoodPinKeyPad>(R.id.key)

        keyPad.setKeyPadListener(object : KeyPadListerner {
            override fun onKeyPadPressed(value: String?) {
            }

            override fun onKeyBackPressed() {
                //implement your code
            }

            override fun onClear() {}
        })

        val pinSubmit = findViewById<Button>(R.id.pinSubmit)
        pinSubmit.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val backBtn = findViewById<ImageView>(R.id.backBtn)
        backBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }}