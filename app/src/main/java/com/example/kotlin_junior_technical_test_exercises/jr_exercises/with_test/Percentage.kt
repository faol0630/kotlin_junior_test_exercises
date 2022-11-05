package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    println(Percentage().getPercentage(800, 90)) //720
}

class Percentage {
     fun getPercentage(number: Int, percentage: Int): Int = (percentage * number) / 100
}