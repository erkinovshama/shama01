package com.itacademy.shama01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var textName: TextView
    lateinit var backButton: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textName = findViewById(R.id.prosmotr)
        backButton = findViewById(R.id.imgbtnback)
        val name = intent.getStringExtra("NAME")
        val surname = intent.getStringExtra("SURNAME")
        textName.text = "$name $surname"
        backButton.setOnClickListener {
            onBackPressed()
        }
    }
}