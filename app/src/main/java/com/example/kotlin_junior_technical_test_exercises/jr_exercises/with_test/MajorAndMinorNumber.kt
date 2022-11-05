package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val numbers = MajorAndMinorNumber()
    numbers.number1C = 15
    numbers.number2C = 25
    println(numbers)

}

class MajorAndMinorNumber {

    var number1C: Int? = null
    var number2C: Int? = null

    fun getMajorAndMinorNumber(number1: Int, number2: Int): String {

        return when {
            (number1 > number2) -> "$number1 is major and $number2 es minor"
            (number2 > number1) -> "$number2 is major and $number1 es minor"
            else -> "Both are the same number"
        }
    }

    override fun toString(): String = getMajorAndMinorNumber(number1C!!, number2C!!)

}