package com.example.complementario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var nombre: EditText
lateinit var num1: EditText
lateinit var num2: EditText
lateinit var enviar: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.TxtNombre)
        num1 = findViewById(R.id.TxtNum1)
        num2 = findViewById(R.id.TxtNum2)
        enviar = findViewById(R.id.BtnSumar)
        resultado = findViewById(R.id.LlbResultado)

        enviar.setOnClickListener{

            var nombreUsuario: String = nombre.text.toString()
            resultado.setText(nombreUsuario)
        }
    }
}