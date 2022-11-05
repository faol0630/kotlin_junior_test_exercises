package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val factorial = Factorial(5)//120
    println(factorial)

}

class Factorial(private val classNumber: Int) {

    fun getFactorial(number1: Int): Int {

        var result = 1

        for (i in 1 until number1) {
            result *= (i + 1)

        }
        return result
    }

    override fun toString(): String = getFactorial(classNumber).toString()

}