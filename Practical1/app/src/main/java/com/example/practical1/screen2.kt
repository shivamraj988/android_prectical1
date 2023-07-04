package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val arm:Button = findViewById(R.id.square)
        val rev:Button = findViewById(R.id.fact)
        val allInput: EditText = findViewById(R.id.input)

        val armOut: TextView = findViewById(R.id.square_output)
        val revv:TextView = findViewById(R.id.factoral_output)

        val clear: Button = findViewById(R.id.clear)


        clear.setOnClickListener{

            revv.setText("")
            armOut.setText("")
            allInput.setText("")

        }


        arm.setOnClickListener{

            val number = allInput.text.toString().toInt()
            var originalNumber: Int
            var remainder: Int
            var result = 0

            originalNumber = number

            while (originalNumber != 0) {
                remainder = originalNumber % 10
                result += Math.pow(remainder.toDouble(), 3.0).toInt()
                originalNumber /= 10
            }

            armOut.isVisible= true

            if (result == number)
                armOut.setText("$number is an Armstrong number.")

            else
                armOut.setText("$number is not an Armstrong number.")
        }



        rev.setOnClickListener{

            val num1= allInput.text.toString().toInt()
            var num = num1


            var str = num.toString()
            var reversedString = str.reversed()
            num = reversedString.toInt()

            revv.setText("Reversed Number: $num")
            revv.isVisible = true
        }


    }


    }
