package com.example.petvet

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //HIDE STATUS BAR LIKE BATTERY NETWORKS
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val animationView = findViewById<LottieAnimationView>(R.id.lottieAnimationView)
        animationView.setAnimation(R.raw.splash_animation) // Use correct lowercase name
        animationView.playAnimation()
        //SPLASH SCREEN
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, SecondSplashActivity::class.java))
            finish()
        }, 3000) // Adjust duration if needed
    }
}
