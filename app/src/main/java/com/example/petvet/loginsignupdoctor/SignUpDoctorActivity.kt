package com.example.petvet.loginsignupdoctor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.petvet.OTPActivity
import com.example.petvet.R

class SignUpDoctorActivity : AppCompatActivity() {  // Inherit from AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctorsignup)

        val buttondoctor: Button = findViewById(R.id.signupdoctorBtn)
        buttondoctor.setOnClickListener {
            val intent = Intent(this, OTPActivity::class.java)
            startActivity(intent)
        }
    }
}
