package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main(){
    val printCompleteAscii = PrintCompleteAscii()
    printCompleteAscii.printAscii()
}
class PrintCompleteAscii {

    private var list = IntArray(256)

    fun printAscii(){
//        list.indices.forEach{ i ->
//            println("$i = ${i.toChar()}")
//        }
        for (i in list){
            println("$i = ${i.toChar()}")
        }
    }
}