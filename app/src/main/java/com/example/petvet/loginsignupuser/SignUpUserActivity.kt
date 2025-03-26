package com.example.petvet.loginsignupuser

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.petvet.R
import com.example.petvet.doctor.DoctorDashboardActivity
import com.example.petvet.user.UserDashboardActivity

class SignUpUserActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usersignup)


        val passwordEditText = findViewById<EditText>(R.id.usersignuptext2)
        val togglePasswordVisibility = findViewById<ImageView>(R.id.togglePasswordVisibility)

        var isPasswordVisible = false
        val passwordEditText2 = findViewById<EditText>(R.id.usersignuptext3)
        val togglePasswordVisibility2 = findViewById<ImageView>(R.id.togglePasswordVisibility)

        var isPasswordVisible2 = false

        togglePasswordVisibility.setOnClickListener {
            isPasswordVisible = !isPasswordVisible
            if (isPasswordVisible) {
                // Show password
                passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                togglePasswordVisibility.setImageResource(R.drawable.baseline_visibility_24) // Update icon
            } else {
                // Hide password
                passwordEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                togglePasswordVisibility.setImageResource(R.drawable.baseline_visibility_off_24) // Update icon
            }
            // Move cursor to the end of the text
            passwordEditText.setSelection(passwordEditText.text.length)
        }
        togglePasswordVisibility2.setOnClickListener {
            isPasswordVisible2 = !isPasswordVisible2
            if (isPasswordVisible2) {
                // Show password
                passwordEditText2.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                togglePasswordVisibility.setImageResource(R.drawable.baseline_visibility_24) // Update icon
            } else {
                // Hide password
                passwordEditText2.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                togglePasswordVisibility2.setImageResource(R.drawable.baseline_visibility_off_24) // Update icon
            }
            // Move cursor to the end of the text
            passwordEditText2.setSelection(passwordEditText2.text.length)
        }
        val buttonsignupuser: Button = findViewById(R.id.usersignupbtn)
        buttonsignupuser.setOnClickListener {
            val intent = Intent(this, UserDashboardActivity::class.java)
            startActivity(intent)
        }
    }
}