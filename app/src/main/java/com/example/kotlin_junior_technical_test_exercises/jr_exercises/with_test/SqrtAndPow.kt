package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

import kotlin.math.*

fun main(){
    val sqrtAndPow = SqrtAndPow()
    println(sqrtAndPow.sqrt1(81.0)) //9.0
    println(sqrtAndPow.pow1(2.0, 8))  // 256.0
    println(sqrtAndPow.pow2(2, 8)) //256

}
class SqrtAndPow {

    fun sqrt1(number: Double): Double{
        return sqrt(number)
    }

    fun pow1(number: Double, numberP: Int): Double{
        return number.pow(8)
    }

    fun pow2(baseNumber: Int, numberP: Int): Int{

        var number1 = 1
        for (i in 1..numberP){
            number1 *= baseNumber
        }
        return number1
    }
}