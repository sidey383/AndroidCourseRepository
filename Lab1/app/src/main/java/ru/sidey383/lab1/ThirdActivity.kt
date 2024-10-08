package ru.sidey383.lab1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class ThirdActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.third_page)
        val button = findViewById<Button>(R.id.button_third)
        button.setOnClickListener { onButtonClick() }
    }

    private fun onButtonClick() {
        val myIntent = Intent(
            this,
            FirstActivity::class.java
        )
        startActivity(myIntent)
        Toast.makeText(baseContext, "Go to first page!" , Toast.LENGTH_SHORT ).show()
    }
}