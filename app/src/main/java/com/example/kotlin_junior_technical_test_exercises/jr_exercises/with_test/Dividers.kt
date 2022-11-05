package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {

    val dividers = Dividers()
    dividers.entering()
    println(dividers)

}

class Dividers {

    var numberC: Int? = null
    var allDividersListC: MutableList<Int> = mutableListOf()

    fun entering() {

        try {
            enteringNumber()

        } catch (e: NumberFormatException) {
            println("Not a number.Please try again")
            entering()
        }
    }

    fun enteringNumber() {

        println("Enter a number :")
        numberC = readLine()!!.toInt()

        allDividersListC = mutableListOf()

    }

    fun getAllDividers(number1: Int, allDividersList: MutableList<Int>): MutableList<Int> {

        for (i in 1..number1) {
            if (number1 % i == 0) {
                allDividersList.add(i)
            }
        }
        return allDividersList
    }

    override fun toString(): String = getAllDividers(numberC!!, allDividersListC).toString()

}
