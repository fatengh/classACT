package com.example.classact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var edname: EditText
    private lateinit var ednam2: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button2)
        ednam2 = findViewById(R.id.ed2)
        edname = findViewById(R.id.ed1)

        btn.setOnClickListener {
            val fName = edname.text.toString()
            val lName = ednam2.text.toString()
            Toast.makeText(
                applicationContext,
                "frist name $fName and lastname $lName",
                Toast.LENGTH_LONG
            )
        }

    }
}