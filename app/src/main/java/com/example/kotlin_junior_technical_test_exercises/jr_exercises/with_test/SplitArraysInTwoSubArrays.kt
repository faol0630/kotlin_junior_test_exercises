package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val splitArraysInTwoSubArrays = SplitArraysInTwoSubArrays()
    splitArraysInTwoSubArrays.newArrays()
    splitArraysInTwoSubArrays.printNewArrays()
}

class SplitArraysInTwoSubArrays {

    private var arr = intArrayOf(1, 4, 8, 12, 17, 22, 28, 33, 37, 40, 43, 46, 49, 51, 56, 67)
    private val n = arr.size //16

    val a = IntArray((n + 1) / 2) //17 /2 = 8
    val b = IntArray(n - a.size) //16 - 8 = 8

    fun newArrays() {

        for (i in 0 until n) {
            if (i < a.size) a[i] = arr[i] else b[i - a.size] = arr[i]
        }
    }

    fun printNewArrays(){
        println(a.contentToString())  // [1, 4, 8, 12, 17, 22, 28, 33] size 8
        println(b.contentToString())  // [37, 40, 43, 46, 49, 51, 56] size 8
    }
}