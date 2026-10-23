package com.example.appkotlin1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class firstActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var count:Int = 0
        val btnCounter:AppCompatButton = findViewById(R.id.buttonCounter)
        val clCounter:TextView= findViewById(R.id.clicsCounter)
        var message = getString(R.string.result,count.toString())
        clCounter.setText(message)

        btnCounter.setOnClickListener{
            count++
            message = getString(R.string.result,count.toString())
            clCounter.setText(message)
        }
    }
}