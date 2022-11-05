package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val capicuaNumber = CapicuaNumber()
    println(capicuaNumber)
}

class CapicuaNumber() {

    private var numberC: Int = 1234321

    fun checkNumber(number: Int): Boolean {

        val stringNumber = number.toString()
        val stringNumberReverse = stringNumber.reversed()

        return stringNumber == stringNumberReverse

    }

    override fun toString(): String = checkNumber(numberC).toString()
}