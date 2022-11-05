package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main(){

    val listNumbers = listOf(25, 20, 50, 70, 30, 5, 10) //30.0

    println(AverageListOfNumbers().getAverage(listNumbers))
    println(AverageListOfNumbers().getAverage2(listNumbers))

}
class AverageListOfNumbers {

    fun getAverage(list: List<Int>): Double = list.average()

    fun getAverage2(list: List<Int>): Int {
        var total = 0

        list.forEach{ i ->
            total += i
        }
        return total / list.size
    }

}