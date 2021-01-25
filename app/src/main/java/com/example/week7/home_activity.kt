package com.example.week7

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.week7.databinding.ActivityHomeActivityBinding

class home_activity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        binding.cardGithub.setOnClickListener {
            val intent = Intent (Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://github.com/KMalif"))
            startActivity(intent)
        }

        binding.cardPassing.setOnClickListener {
            parsingDialogue(this, object : PassDialogInterface{
                override fun onPassButtonClicked(startActivity: ParsingValue){

                }
            }).show()
        }

        binding.cardLoguot.setOnClickListener {
            finish()
        }

    }
}