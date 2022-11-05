package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//quantity of odd numbers between two numbers

fun main() {

    OddBetweenTwoNumbers().run {
        lowerNumber = 5
        higherNumber = 20
        println(this)
    }

}

class OddBetweenTwoNumbers {

    var lowerNumber: Int? = null
    var higherNumber: Int? = null

    private var counter = 0

    fun oddNumbers(lower: Int, higher: Int): Int {
        for (i in lower..higher) {
            if (i % 2 == 1) {
                counter++
            }
        }
        return counter
    }

    override fun toString(): String = oddNumbers(lowerNumber!!, higherNumber!!).toString()

}