package com.example.pepebeem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.core.view.WindowCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.sidesheet.SideSheetDialog
import android.view.Gravity



class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val navView = findViewById<ImageView>(R.id.navView)
        navView.setOnClickListener {
            val sideSheetDialog = SideSheetDialog(this)
            sideSheetDialog.setContentView(R.layout.side_sheet)

            val sideSheetLayoutParams = sideSheetDialog.window?.attributes
            sideSheetLayoutParams?.gravity = Gravity.START
            sideSheetDialog.window?.attributes = sideSheetLayoutParams

            sideSheetDialog.show()
        }

        val prfl = findViewById<CardView>(R.id.propailcard)
        prfl.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()}

        val prfl2 = findViewById<ImageView>(R.id.profile)
        prfl2.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()}

        val conn = findViewById<CardView>(R.id.conncard)
        conn.setOnClickListener {
            val intent = Intent(this, ConnectionsActvity::class.java)
            startActivity(intent)
            finish()}

        val notificationbtn = findViewById<ImageView>(R.id.notificationbtn)
        notificationbtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
            finish()}

        val applyButton = findViewById<FloatingActionButton>(R.id.apply)
        applyButton.setOnClickListener {
            val intent = Intent(this, TabLayoutActivity::class.java)
            startActivity(intent)
            finish()}

        val reviewButton = findViewById<CardView>(R.id.reviewbtn)
        reviewButton.setOnClickListener {
            val intent = Intent(this, ReviewActivity::class.java)
            startActivity(intent)
            finish()}

        val namanama = arrayOf<String>(
            "Game Developer",
            "Android Developer",
            "Web Developer",
            "Graphic Designer",
            "3D Modeller",
            "Lawyer"
        )

        val fotofoto = arrayOf<Int>(
            R.drawable.game,
            R.drawable.andro2,
            R.drawable.web,
            R.drawable.graphicdes,
            R.drawable.tridimod,
            R.drawable.lawyer
        )

        val Deskripsi = arrayOf<String>(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio.",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tempor ex volutpat consectetur efficitur. Fusce efficitur, erat pretium lacinia tincidunt, magna orci mattis orci, non porttitor diam justo sodales elit. Donec elementum quis quam at sagittis. Donec eu dolor rhoncus, rhoncus lectus a, ultricies quam. Curabitur pretium aliquam tortor ac dignissim. Nulla a orci scelerisque, finibus leo nec, suscipit enim. Duis vel tempus nunc, at mattis nisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac lacus vulputate, scelerisque tortor quis, volutpat odio."
        )

        val salary = arrayOf<String>(
            "$100.000 / year",
            "$127,151 / year",
            "108,471 / year",
            "$50,700 / year",
            "$78,472 / year",
            "$165,082 / year"
        )

        val gameDev = findViewById<CardView>(R.id.gameDev)
        gameDev.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[0])
            intent.putExtra("foto", fotofoto[0])
            intent.putExtra("gaji", salary[0])
            intent.putExtra("deskripsi", Deskripsi[0])
            startActivity(intent)
        }

        val androDev = findViewById<CardView>(R.id.androidDevs)
        androDev.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[1])
            intent.putExtra("foto", fotofoto[1])
            intent.putExtra("gaji", salary[1])
            intent.putExtra("deskripsi", Deskripsi[1])
            startActivity(intent)
        }

        val cdPr = findViewById<CardView>(R.id.program)
        cdPr.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[1])
            intent.putExtra("foto", fotofoto[1])
            intent.putExtra("gaji", salary[1])
            intent.putExtra("deskripsi", Deskripsi[1])
            startActivity(intent)
        }

        val webDev = findViewById<CardView>(R.id.webDevs)
        webDev.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[2])
            intent.putExtra("foto", fotofoto[2])
            intent.putExtra("gaji", salary[2])
            intent.putExtra("deskripsi", Deskripsi[2])
            startActivity(intent)
        }

        val graDes = findViewById<CardView>(R.id.graDis)
        graDes.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[3])
            intent.putExtra("foto", fotofoto[3])
            intent.putExtra("gaji", salary[3])
            intent.putExtra("deskripsi", Deskripsi[3])
            startActivity(intent)
        }

        val grpic = findViewById<CardView>(R.id.design)
        grpic.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[3])
            intent.putExtra("foto", fotofoto[3])
            intent.putExtra("gaji", salary[3])
            intent.putExtra("deskripsi", Deskripsi[3])
            startActivity(intent)
        }

        val tridi = findViewById<CardView>(R.id.triDis)
        tridi.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[4])
            intent.putExtra("foto", fotofoto[4])
            intent.putExtra("gaji", salary[4])
            intent.putExtra("deskripsi", Deskripsi[4])
            startActivity(intent)
        }

        val tridi2 = findViewById<CardView>(R.id.tridi)
        tridi2.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[4])
            intent.putExtra("foto", fotofoto[4])
            intent.putExtra("gaji", salary[4])
            intent.putExtra("deskripsi", Deskripsi[4])
            startActivity(intent)
        }

        val lawz = findViewById<CardView>(R.id.lawsz)
        lawz.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[5])
            intent.putExtra("foto", fotofoto[5])
            intent.putExtra("gaji", salary[5])
            intent.putExtra("deskripsi", Deskripsi[5])
            startActivity(intent)
        }

        val lawNew = findViewById<CardView>(R.id.laws)
        lawNew.setOnClickListener {
            val intent = Intent(this, JobDescActivity::class.java)
            intent.putExtra("nama", namanama[5])
            intent.putExtra("foto", fotofoto[5])
            intent.putExtra("gaji", salary[5])
            intent.putExtra("deskripsi", Deskripsi[5])
            startActivity(intent)
        }

        }

    }