package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//Display all numbers from 1 to n number.
//if the number is a multiple of 3 show: buzz
//if it's a multiple of 5 show: lightYear
//if it's a multiple of 3 and 5 show: buzzLightYear

fun main(){
    val multiplesOf3And5 = MultiplesOf3And5()
    multiplesOf3And5.getMultiples(40)

}

class MultiplesOf3And5 {

    fun getMultiples(higher: Int){

        (1..higher).forEach{ i -> //for (i in 1..higher)

            when{
                (i % 3 == 0 && i % 5 == 0) -> println("$i buzzLightYear")
                (i % 3 == 0) -> println("$i buzz")
                (i % 5 == 0) -> println("$i lightYear")
                else -> println(i)
            }

        }

    }

}