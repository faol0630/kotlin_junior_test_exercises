package com.example.kotlin_junior_technical_test_exercises.jr_exercises

//determine if a number is prime

fun main() {
    val prime = PrimeNumber()
    prime.numberC = 199
    println(prime)

    val prime2 = PrimeNumber2()
    prime2.numberC = 199
    println(prime2)

}

class PrimeNumber {

    var numberC: Int? = null

    fun primeNumber(number: Int): String {
        var i = 2
        var flag = false

        while (i <= number / 2) {
            if (number % i == 0) {
                flag = true
                break
            }
            i++
        }
        return if (!flag) {
            "$number is a prime number"
        } else {
            "$number is not a prime number"
        }

    }

    override fun toString(): String = primeNumber(numberC!!)

}

class PrimeNumber2() {

    var numberC: Int? = null

    private fun getPrimeNumber(number1: Int): String {

        val allDividersList: MutableList<Int> = mutableListOf()

        for (i in 1 until number1) {
            if (number1 % i == 0) {
                allDividersList.add(i)
            }
        }

        return if (allDividersList.size == 1) {
            "$number1 is a prime number"
        } else {
            "$number1 is not a prime number"
        }

    }

    override fun toString(): String = getPrimeNumber(numberC!!)
}