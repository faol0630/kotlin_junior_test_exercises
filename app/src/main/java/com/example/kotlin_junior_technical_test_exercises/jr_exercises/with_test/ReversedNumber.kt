package com.example.kotlin_junior_technical_test_exercises


fun main() {
    val reversedNumber = ReversedNumber()
    reversedNumber.classNumber = 12345
    println(reversedNumber)

    val reversedNumber2 = ReversedNumber2(12345)
    println(reversedNumber2)
}

//option one:
class ReversedNumber {

    var classNumber: Int? = null

    fun reverseNumber(number1: Int): Int {

        val numberToString = number1.toString()
        val reverseString = numberToString.reversed()

        return reverseString.toInt()
    }

    override fun toString(): String = reverseNumber(classNumber!!).toString()
}

//option two:
class ReversedNumber2(private val classNumber: Int) {

    private fun reverseNumber2(number: Int): Int {

        val numberToString = number.toString()
        val newStringNumber = StringBuilder()

        for (i in numberToString.length - 1 downTo 0) {
            newStringNumber.append(numberToString[i])
        }
        return newStringNumber.toString().toInt()
    }

    override fun toString(): String = reverseNumber2(classNumber).toString()
}