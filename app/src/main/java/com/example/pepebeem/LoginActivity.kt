package com.example.pepebeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import android.widget.Button
import androidx.core.view.WindowCompat


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val signupText = findViewById<TextView>(R.id.signupText)
        signupText.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, PinActivity::class.java)
            startActivity(intent)
            finish()
         }
}}