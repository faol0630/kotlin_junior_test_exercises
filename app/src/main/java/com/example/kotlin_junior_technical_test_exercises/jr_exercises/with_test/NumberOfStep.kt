package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//show a staircase with N number of steps

fun main(){
    val numberOfSteps = NumberOfSteps()
    numberOfSteps.steps(4)
}
class NumberOfSteps {

    fun steps(steps1: Int){
        for (i in steps1 downTo 1){
            for (j in steps1 downTo i){
                print("[-]")
            }
            println()
        }
    }

}
//result:

//[-]
//[-][-]
//[-][-][-]
//[-][-][-][-]
