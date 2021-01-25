package com.example.week7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parsing_value.*

class ParsingValue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parsing_value)

        val name = intent.getStringExtra("Name")
        val age = intent.getStringExtra("age")

        val say = "hi I'm $name I'm $age YO"
        tvHasil.text = say
    }
}