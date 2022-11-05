package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main(){

    val descendentListWithIntervals = DescendentListWithIntervals()
    descendentListWithIntervals.downToZero(8, 100)

}

class DescendentListWithIntervals {

    fun downToZero(interval: Int, number1: Int){

        println("--- Del $number1 al cero ---")

        for(i in number1 downTo 0 step interval){
            println("- # $i ")
        }

        println("--- End ---")

    }

}