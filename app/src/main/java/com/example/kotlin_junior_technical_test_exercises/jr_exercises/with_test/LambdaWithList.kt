package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main(){

    val numberList = IntArray(5){it}
    val numberList2 = IntArray(10) { it * 2 }


    val lambdaWithList = LambdaWithList()
    lambdaWithList.printNumberList(numberList)
    lambdaWithList.printNumberList(numberList2)
    lambdaWithList.numberList3 // is displayed first


}
class LambdaWithList {

    val numberList3 = IntArray(5) { 3 * (it + 1) }.printIntArray()

    fun printNumberList(list: IntArray) {
        list.forEach { i ->
            print("$i ")
        }
        println()


    }

    //extension function:

    fun IntArray.printIntArray(){
        this.forEach{ i ->
            print("$i ")
        }
        println()
    }

}