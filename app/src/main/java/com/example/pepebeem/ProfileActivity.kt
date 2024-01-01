package com.example.pepebeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView
import androidx.core.view.WindowCompat
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel


class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val editProfile = findViewById<Button>(R.id.editProfile)
        editProfile.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        val homeBtn = findViewById<ImageView>(R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()
        }

        val expbtn = findViewById<TextView>(R.id.experiencebtn)
        expbtn.setOnClickListener {
            val intent = Intent(this, ProfileExpActivity::class.java)
            startActivity(intent)
            finish()
        }

        val reviewbtn = findViewById<TextView>(R.id.reviewbtn)
        reviewbtn.setOnClickListener {
            val intent = Intent(this, ProfileReviewActivity::class.java)
            startActivity(intent)
            finish()
        }

        val socmedbtn = findViewById<TextView>(R.id.socmed)
        socmedbtn.setOnClickListener {
            val intent = Intent(this, SocmedActivity::class.java)
            startActivity(intent)
            finish()
        }

        val connectbtn = findViewById<TextView>(R.id.connections)
        connectbtn.setOnClickListener {
            val intent = Intent(this, ConnectionsActvity::class.java)
            startActivity(intent)
            finish()
        }

        val imageList = ArrayList<SlideModel>() // Create image list

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://cdn.discordapp.com/attachments/1094703367995015189/1187559891217416202/nynim.png?ex=65975455&is=6584df55&hm=0abf4b140646cd7fbadeaa41e6e7c89d0a9be8c888105eb1a31a87df5e9fb914&", "Typography Ninym Raleigh"))
        imageList.add(SlideModel("https://cdn.discordapp.com/attachments/1094703367995015189/1187560376590671982/Milize_Wallpaper.png?ex=659754c9&is=6584dfc9&hm=7e40f4943fa33c8a20778622dc153ba69e46eafca3c25ce87a266aa06de52484&", "Steam Banner Vladilene Milize"))
        imageList.add(SlideModel("https://cdn.discordapp.com/attachments/1094703367995015189/1187561350361255996/Tuna_1.png?ex=659755b1&is=6584e0b1&hm=72442984177d9528d01cb58f77187fe624b738d5c1296f922ff91482bc62d35b&", "Vector Art Herrscher of Void"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

    }}