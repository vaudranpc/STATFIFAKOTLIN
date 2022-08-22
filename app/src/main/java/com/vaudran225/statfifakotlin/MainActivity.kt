package com.vaudran225.statfifakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_Score = findViewById(R.id.Score) as Button
        val btn_Stat = findViewById(R.id.Statistique) as Button
        // set on-click listener
        btn_Score.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Score ", Toast.LENGTH_SHORT).show()
        }

        btn_Stat.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Statistique  ", Toast.LENGTH_SHORT).show()
        }
    }
}