package com.example.complementario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var num1: EditText
lateinit var num2: EditText
lateinit var sumaRes: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.TxtNum1)
        num2 = findViewById(R.id.TxtNum2)
        sumaRes = findViewById(R.id.BtnSumar)
        resultado = findViewById(R.id.LlbResultado)

        sumaRes.setOnClickListener{

            var primerN: Float = num1.text.toString().toFloat()
            var segundoN: Float = num2.text.toString().toFloat()
            var sumaResultado = primerN + segundoN
            resultado.setText("Suma de: " +primerN+ " + " +segundoN + " = " +sumaResultado.toString())
        }
    }
}