package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var etNumber:TextView
    lateinit var etNumber2:TextView
    lateinit var tvCAL:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
             super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnminus)
        btnMultiply = findViewById(R.id.btnMultipy)
        btnModulus = findViewById(R.id.btnModulus)
        etNumber = findViewById(R.id.etNumber)
        etNumber2 = findViewById(R.id.etNumber2)
        tvCAL = findViewById(R.id.tvCAL)


        btnPlus.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            if (num1.isBlank()){
                etNumber.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNumber2.error="Fill in the Blank Place"
                return@setOnClickListener
            }
            add(num1.toInt(),num2.toInt())
        }

        btnMinus.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            if (num1.isBlank()){
                etNumber.error="Fill in the Blank Place"
            }
            if (num2.isBlank()){
                etNumber2.error="Fill in the Blank Place"
            }
            subtruction(num1.toInt(),num2.toInt())
        }

        btnMultiply.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            if (num1.isBlank()){
                etNumber.error="Fill in the Blank Place"
            }
            if (num2.isBlank()){
                etNumber2.error="Fill in the Blank Place"
            }
            multiply(num1.toInt(),num2.toInt())
        }
        btnModulus.setOnClickListener {
            var num1 = etNumber.text.toString()
            var num2 = etNumber2.text.toString()
            if (num1.isBlank()){
                etNumber.error="Fill in the Blank Place"
            }
            if (num2.isBlank()){
                etNumber2.error="Fill in the Blank Place"
            }
            modulus(num1.toInt(),num2.toInt())
        }

    }
    fun add(num1:Int, num2:Int){
        val plus= num1+num2
        tvCAL.text=plus.toString()
    }
    fun subtruction(num1:Int, num2:Int){
        val minus = num1-num2
        tvCAL.text=minus.toString()
    }
    fun multiply(num1:Int, num2:Int){
        val times = num1*num2
        tvCAL.text=times.toString()
    }
    fun modulus(num1:Int, num2:Int){
        val reminder = num1%num2
        tvCAL.text=reminder.toString()
    }

}