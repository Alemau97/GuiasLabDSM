package com.example.guia12

import kotlin.math.sqrt

class CalculatorModel {

    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }
    fun substract(num1: Double, num2: Double): Double {
        return num1 - num2
    }
    fun multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }
    fun divide(num1: Double, num2: Double): Double {
        return num1 / num2
    }
    fun raiz(num1: Double): Double {
        return sqrt(num1)
    }
}