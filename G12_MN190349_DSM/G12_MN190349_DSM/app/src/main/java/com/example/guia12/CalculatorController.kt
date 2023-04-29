package com.example.guia12

import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorController(private val view: MainActivity) {
    private val model = CalculatorModel()

    init{
        //Asociar eventos de click a los botones
        view.findViewById<Button>(R.id.btn_add).setOnClickListener {
            performOperation("add")
        }
        view.findViewById<Button>(R.id.btn_substract).setOnClickListener {
            performOperation("substract")
        }
        view.findViewById<Button>(R.id.btn_multiply).setOnClickListener {
            performOperation("multiply")
        }
        view.findViewById<Button>(R.id.btn_divide).setOnClickListener {
            performOperation("divide")
        }
        view.findViewById<Button>(R.id.btn_sqrt).setOnClickListener {
            performOperation("raiz")
        }
    }

    private fun performOperation(operation: String){
        val num1 = view.findViewById<EditText>(R.id.num1).text.toString().toDouble()
        val num2 = view.findViewById<EditText>(R.id.num2).text.toString().toDouble()

        //Realizar la operación correspondiente
        val result = when (operation){
            "add" -> model.add(num1,num2)
            "substract" -> model.substract(num1,num2)
            "multiply" -> model.multiply(num1,num2)
            "divide" -> model.divide(num1,num2)
            "raiz" -> model.raiz(num1)
            else -> throw IllegalArgumentException("Operación no válida")
        }

        //Actualizar la vista con el resultado
        view.findViewById<TextView>(R.id.result).text = "Resultado: $result"
    }
}