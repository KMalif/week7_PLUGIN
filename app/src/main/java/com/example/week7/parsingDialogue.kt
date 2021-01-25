package com.example.week7

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import kotlinx.android.synthetic.main.parsing_dialogue.*

class parsingDialogue(context: Context, var passDialogListener : PassDialogInterface):AppCompatDialog(context){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.parsing_dialogue)

        tvParsing.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()

           Intent(Intent(context, ParsingValue::class.java)).also {
               it.putExtra("Name", name)
               it.putExtra("age", age)
               passDialogListener.onPassButtonClicked(startActivity = ParsingValue())
               dismiss()
           }
            if (name.isEmpty() || age.isEmpty()){
                Toast.makeText(context, "Please enter all information", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
        }

        tvCancel.setOnClickListener {
            cancel()
        }
    }
}