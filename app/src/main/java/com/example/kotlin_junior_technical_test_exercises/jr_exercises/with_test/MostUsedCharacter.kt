package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//most used character in string
fun main() {

    val mostUsedCharacter = MostUsedCharacter()
    mostUsedCharacter.characterToHashCode("Game of thrones")
    mostUsedCharacter.lookingMostUsed()
    mostUsedCharacter.printMostUsed()

}

class MostUsedCharacter {

    val counter = IntArray(256)
    var times = 0

    fun characterToHashCode(text: String) {

        var i = 0

        val newText = text.replace(" ", "")

        while (i < newText.length) {
            counter[newText[i].hashCode()]++
            i++
        }

    }

    fun lookingMostUsed(){

        var i = 0

        while (i < 256) {

            if (counter[i] > times) {
                times = counter[i]//largest value in 256 elements list
            }
            i++
        }
        println("Times value = $times")

    }

    fun printMostUsed(){

        var i = 0

        while (i < 256){
            if (counter[i] == times){
                println(i.toChar().toString() + " : " + counter[i])
            }
            i++
        }
    }

}