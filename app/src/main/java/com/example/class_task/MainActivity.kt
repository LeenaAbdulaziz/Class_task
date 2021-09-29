package com.example.class_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Firt_name: EditText
    lateinit var Last_name: EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Firt_name=findViewById(R.id.editText)
        Last_name=findViewById(R.id.editText2)
        button=findViewById(R.id.button)
        button.setOnClickListener() {
            val list=listOf(Firt_name.text,Last_name.text)
            Toast.makeText(applicationContext, "$list", Toast.LENGTH_SHORT).show()

        }
    }
}