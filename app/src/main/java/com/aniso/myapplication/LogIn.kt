package com.aniso.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aniso.myapplication.databinding.ActivityMain2Binding
import com.aniso.myapplication.databinding.ActivitySignupBinding

class LogIn : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate((layoutInflater))
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        validateALogIn()
    }

    fun validateALogIn() {
        val email = binding.etemail1.text.toString()
        val password = binding.etpassword.text.toString()
        var error = false

        if (email.isBlank()) {
            binding.tilemail.error = "Email is required"
            error = true
        }
        if (password.isBlank()) {
            binding.tilpassword.error = "password is required"
            error = true
        }

        if (!error) {
            Toast.makeText(this, "logged in successfully", Toast.LENGTH_SHORT).show()


        }

    }
}