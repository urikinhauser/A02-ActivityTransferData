package com.example.lesson_2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btEnvio.setOnClickListener {
            // Action
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("Email", etEmail.toString())
            intent.putExtra("Password", etPassword.toString())
            startActivity(intent)
        }
    }
}
