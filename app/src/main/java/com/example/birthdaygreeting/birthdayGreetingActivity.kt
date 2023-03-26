package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class birthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        val birthdayGreetingText = findViewById<TextView>(R.id.birthdayGreetingText)
        birthdayGreetingText.text = "Happy Birthday $name"
    }
}