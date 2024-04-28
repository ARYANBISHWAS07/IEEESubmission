package com.example.ieeesub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var userInputEditText: EditText
    private lateinit var displayTextView: TextView
    private lateinit var showInputButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInputEditText = findViewById(R.id.userInputEditText)
        displayTextView = findViewById(R.id.displayTextView)
        showInputButton = findViewById(R.id.showInputButton)

        showInputButton.setOnClickListener {
            // Check if userInputEditText is initialized and not null
            if (::userInputEditText.isInitialized) {
                val userInput = userInputEditText.text.toString()
                displayTextView.text = userInput
            } else {
                // Handle case where userInputEditText is not initialized
                displayTextView.text = "Invalid"
            }
        }
    }
}
