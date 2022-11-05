package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main(){
    val iterating = IteratingOverElementsOrIndices()
    iterating.iteratingOverElements(iterating.numberList)
    iterating.iteratingOverIndices(iterating.numberList)

}
class IteratingOverElementsOrIndices {

    var numberList = listOf(23, 45, 12, 64, 76, 32, 31, 81, 47, 21, 98)

    fun iteratingOverElements(list: List<Int>){
        println("Iterating over elements:")
        for (i in list){
            println(i)
        }
        println()
    }
    fun iteratingOverIndices(list: List<Int>){
        println("Iterating over indices:")
        for (i in list.indices){
            println(i)
        }
    }

}