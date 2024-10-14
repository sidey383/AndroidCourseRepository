package ru.sidey383.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class SecondActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.second_page)
        val button = findViewById<Button>(R.id.button_second)
        button.setOnClickListener { onButtonClick() }
    }

    private fun onButtonClick() {
        val myIntent = Intent(
            this,
            ThirdActivity::class.java
        )
        startActivity(myIntent)
        Toast.makeText(baseContext, R.string.second_page_toast, Toast.LENGTH_SHORT).show()
    }
}