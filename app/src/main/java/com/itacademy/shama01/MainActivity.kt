package com.itacademy.shama01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var firstedit: EditText
    lateinit var secondedit: EditText
    lateinit var btndalee: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstedit = findViewById(R.id.firstedit)
        secondedit = findViewById(R.id.secondedit)
        btndalee = findViewById(R.id.dalee)
        btndalee.setOnClickListener {
            val name = firstedit.text.toString()
            val surname = secondedit.text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("NAME", name)
            intent.putExtra("SURNAME", surname)

            startActivity(intent)
        }
    }
}