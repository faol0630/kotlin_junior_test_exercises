package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val multiplicationTable = MultiplicationTable()
    multiplicationTable.getMultiplicationTable(9)

    multiplicationTable.printMultiplicationTable2(5)
}

class MultiplicationTable {

    fun getMultiplicationTable(number: Int) {
        for (i in 1..10) {
            println("$number X $i = ${number * i}")
            Thread.sleep(1000)//display one line per second
        }
        println()
    }

    fun printMultiplicationTable2(number: Int) {

        val list = IntArray(10) { (it + 1) * number }
        var counter = 1

        list.forEach { x ->
            println("$number X $counter = $x ")
            counter++
        }
    }
}