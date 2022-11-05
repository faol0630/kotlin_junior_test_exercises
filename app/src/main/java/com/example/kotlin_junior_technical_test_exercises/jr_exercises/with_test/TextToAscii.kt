package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main(){
    val textToAscii = TextToAscii()
    textToAscii.printAscii("aracataca")
}

class TextToAscii {

    fun printAscii(text1: String){
        text1.indices.forEach{ i ->
            //println("${text1[i]} = ${text1[i].hashCode()}")
            print("${text1[i].hashCode()}/")
        }
    }

}