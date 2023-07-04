package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class Screen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)
        val factInput:EditText = findViewById(R.id.input)
        val sqe:TextView = findViewById(R.id.square_output)
        val FactBtn:Button = findViewById(R.id.fact)
        val factOut:TextView = findViewById(R.id.factoral_output)
        val sqrBtn:Button = findViewById(R.id.square)
        val clear: Button = findViewById(R.id.clear)


        clear.setOnClickListener{

            sqe.setText("")
            factOut.setText("")
            factInput.setText("")

        }

        sqrBtn.setOnClickListener{
            try {
                val str = factInput.text.toString().toInt()
                val sq = str * str;
                sqe.setText("Square of  $str = " + sq.toString())
                sqe.isVisible = true
            }catch (e: Exception) {
                Toast.makeText(this, "Invalid Input! \n Please enter a number", Toast.LENGTH_SHORT).show()
            } finally {
                // optional finally block
            }
        }

        FactBtn.setOnClickListener{
            try {
                val str = factInput.text.toString().toInt()

                var fact= 1;
                for(i in 1..str){
                    fact = fact*i;
                }
                factOut.setText("Factorial of  $str = "+ fact.toString())

                factOut.isVisible = true
            }catch (e: Exception) {
                Toast.makeText(this, "Invalid Input! \n Please enter a number", Toast.LENGTH_SHORT).show()
            } finally {

            }


        }

    }
}