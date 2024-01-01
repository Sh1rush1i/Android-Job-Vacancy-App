package com.example.pepebeem

import android.os.Handler
import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager

class SplashActivity : AppCompatActivity() {


    companion object {
        //NOTE: It is recommended to keep the time less than 3000 ms
        // but as this is just going to be demo so I'm using 6000 ms
        // to show the full animation.
        const val ANIMATION_TIME: Long = 3000 //Change time according to your animation.
    }
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        //Use Handler to delay the start of next Activity
        // and show animation in the mean while
        Handler(this.mainLooper).postDelayed({
            //This block will be executed after ANIMATION_TIME milliseconds.
            //After ANIMATION_TIME we will start the MainActivity
            startActivity(Intent(this, LoginActivity::class.java))
            //To remove this activity from back stack so that
            // this activity will not show when user closes MainActivity
            finish()
        }, ANIMATION_TIME)

    }

}