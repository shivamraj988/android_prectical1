package com.example.practical1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.screan1)
        val Button2 = findViewById<Button>(R.id.screan2)
        Button.setOnClickListener{

            val intent = Intent(this, Screen1::class.java)
            startActivity(intent);

        }
        Button2.setOnClickListener {
            val intent = Intent(this, screen2::class.java)
            startActivity(intent);
        }
    }
}