package com.example.pepebeem

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.ncorti.slidetoact.SlideToActView


class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofile)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val spinner: Spinner = findViewById(R.id.gender)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.gender,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        val slide = findViewById<SlideToActView>(R.id.sliderbro)
        slide.animDuration = 600
        slide.bumpVibration = 500
        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                val saveProfileButton: Button = findViewById(R.id.saveProfile)
                saveProfileButton.isEnabled = true
            }
        }

        val buttonBackEdit = findViewById<ImageView>(R.id.backEdit)
        buttonBackEdit.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val saveProfile = findViewById<Button>(R.id.saveProfile)
        saveProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val cancelEdit = findViewById<Button>(R.id.cancelEdit)
        cancelEdit.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val notificationBtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationBtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

