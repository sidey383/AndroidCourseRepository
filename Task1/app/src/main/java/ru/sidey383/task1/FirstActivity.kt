package ru.sidey383.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class FirstActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.first_page)
        val button = findViewById<Button>(R.id.button_first)
        button.setOnClickListener { onButtonClick() }
    }

    private fun onButtonClick() {
        val myIntent = Intent(
            this,
            SecondActivity::class.java
        )
        startActivity(myIntent)
        Toast.makeText(baseContext, R.string.first_page_toast , Toast.LENGTH_SHORT ).show()
    }
}