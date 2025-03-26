package com.example.petvet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import com.example.petvet.loginsignupuser.LoginDoctorActivity
import com.example.petvet.loginsignupuser.LoginUserActivity

class SecondSplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondsplash)
        //button for user in second splash screen
        val buttonuser: Button = findViewById(R.id.btnsplashuser)
        buttonuser.setOnClickListener {
            val intent = Intent(this, LoginUserActivity::class.java)
            startActivity(intent)
        }
        //button for doctor in second splash screen
        val buttondoctor: Button = findViewById(R.id.btnsplashdoctor)
        buttondoctor.setOnClickListener {
            val intent = Intent(this, LoginDoctorActivity::class.java)
            startActivity(intent)
        }

    }
}