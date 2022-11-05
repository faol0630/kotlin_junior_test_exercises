package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main(){
    println(RandomNumberBetweenTwoNumbers().getRandomNumber(10, 30))

}

class RandomNumberBetweenTwoNumbers {
    fun getRandomNumber(lowest: Int, higher: Int): Int = (lowest..higher).random()

}