package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val multiple = Multiple()
    multiple.printResult(210, 7)
}

class Multiple{

    fun multiple(mult: Int, num: Int): Boolean = mult % num == 0

    fun printResult(mult: Int, num: Int) = println(multiple(mult, num))

}