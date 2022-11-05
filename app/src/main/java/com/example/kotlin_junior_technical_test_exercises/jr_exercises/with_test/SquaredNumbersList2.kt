package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//show the squares of all numbers up to a given number

fun main(){
    val squaredNumbersList2 = SquaredNumbersList2()
    squaredNumbersList2.showSquaredNumbers2(5)
}

class SquaredNumbersList2 {

    fun showSquaredNumbers2(givenNumber: Int){
        for (i in 1..givenNumber){
            println ("$i : ${i * i}")
        }
    }

}

//1 : 1
//2 : 4
//3 : 9
//4 : 16
//5 : 25