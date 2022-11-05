package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main(){
    val repeatStringSeveralTimes = RepeatStringSeveralTimes()
    repeatStringSeveralTimes.repeatString("Words", 5)
}
class RepeatStringSeveralTimes {

    fun repeatString(phrase: String, times: Int){
        for (i in 1..times){
            println(phrase)
        }
    }
}