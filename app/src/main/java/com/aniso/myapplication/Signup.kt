package com.aniso.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aniso.myapplication.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate((layoutInflater))
        setContentView(binding.root)
        binding.btnlogIn.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }


    override fun onResume() {
        super.onResume()
        validateASignup()
    }

    fun validateASignup() {
        val email = binding.etEmail.text.toString()
        val username = binding.etUsername.text.toString()
        val phone = binding.etPhone.text.toString()
        val password = binding.etPassword.text.toString()
        var error = false

        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }
        if (phone.isBlank()) {
            binding.tilPhone.error = "Phone number is required"
            error = true
        }
        if (password.isBlank()) {
            binding.tilpassword.error = "password is required"
            error = true
        }

        if (username.isBlank()) {
            binding.tilUsername.error = "name is required is required"
            error = true
        }
        if (!error) {
            Toast.makeText(this, "successfully signed up", Toast.LENGTH_SHORT).show()



        }

    }
}


