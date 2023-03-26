package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val birthdayButton = findViewById<Button>(R.id.birthdayButton)
        birthdayButton.setOnClickListener {
            val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
//            Toast.makeText(this, "name is $name", Toast.LENGTH_LONG).show()
            val intent = Intent(this, birthdayGreetingActivity::class.java)
            intent.putExtra(birthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
        }

    }
}