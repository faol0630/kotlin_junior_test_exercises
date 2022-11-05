package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//implementar Thread.sleep

fun main() {
    val timer = Timer()
    timer.callingFun(10)
}

class Timer {

    fun callingFun(target: Int) {
        for (i in 1..target) {
            println(i)
            Thread.sleep(1000)

            if (i == target) {
                println("Target reached")
            }
        }
    }
}