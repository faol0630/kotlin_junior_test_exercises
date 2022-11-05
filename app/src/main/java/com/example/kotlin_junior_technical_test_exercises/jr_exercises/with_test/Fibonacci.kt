package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {

    val fibonacciList = mutableListOf(0, 1)
    val fibonacci = Fibonacci()
    fibonacci.cNumber = 10
    fibonacci.fibonacciListC = fibonacciList
    println(fibonacci)
    fibonacci.printFibonacciList()
}

class Fibonacci {

    var cNumber: Int? = null
    var fibonacciListC: MutableList<Int>? = null

    fun fibonacciAddNumbers(position: Int, fibonacciList: MutableList<Int>): Int {

        var fibonacci1 = 0
        var fibonacci2 = 1
        var fibonacci3 = 1

        for (i in 2..position) {
            fibonacci3 = fibonacci1 + fibonacci2
            fibonacci1 = fibonacci2
            fibonacci2 = fibonacci3
            fibonacciList.add(fibonacci3)
        }
        return fibonacci3
    }

    fun printFibonacciList() {
        println(fibonacciListC)
    }

    override fun toString(): String = "${fibonacciAddNumbers(cNumber!!, fibonacciListC!!)} "
}