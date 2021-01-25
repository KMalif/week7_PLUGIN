package com.example.week7

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Intent.setOnClickListener {
            startActivity(Intent(this, SeconActivity::class.java))
            Toast.makeText( this, "Activity 2", Toast.LENGTH_SHORT).show()
        }

        btn_IntentImplicit.setOnClickListener {
            val intent = Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://github.com/KMalif"))
            startActivity(intent)

        }
    }
}