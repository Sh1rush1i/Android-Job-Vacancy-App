package com.example.pepebeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.WindowCompat
import com.google.android.material.textfield.TextInputEditText


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

        val isianusername = findViewById<TextInputEditText>(R.id.inputuser)
        val isianpassword = findViewById<TextInputEditText>(R.id.inputpass)
        var btnLog = findViewById<Button>(R.id.loginButton)

        btnLog.setOnClickListener {
            var textuser = isianusername.text.toString()
            var textpass = isianpassword.text.toString()

            if(textuser == "" || textpass == ""){
                Toast.makeText(this, "Username/password must be filled",
                    Toast.LENGTH_LONG).show()
            }
            else{
                val alertDialog = AlertDialog.Builder(this)
                alertDialog.setTitle("Welcome " + textuser)
                alertDialog.setMessage("Loading")

                alertDialog.setPositiveButton("Okay") { dialog, which ->
                    val _inten = Intent(this,PinActivity::class.java)
                    startActivity(_inten)
                    finish()
                }

                alertDialog.show()
            }
        }
}}