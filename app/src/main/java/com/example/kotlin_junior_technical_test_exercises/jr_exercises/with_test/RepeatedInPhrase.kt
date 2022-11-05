package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//Find repeated characters in a sentence

fun main() {
    val repeatedInPhrase = RepeatedInPhrase()
    repeatedInPhrase.countRepeated("Phrase where the repeated ones are going to be searched")
    repeatedInPhrase.findRepeated()
}

class RepeatedInPhrase {

    var counter = IntArray(256)

    fun countRepeated(phrase: String) {

        val counter2 = IntArray(256)

        val length1: Int = phrase.length
        var i = 0

        while (i < length1) {
            counter2[phrase[i].hashCode()] = counter2[phrase[i].hashCode()] + 1
            i++
        }
        counter = counter2

    }

    fun findRepeated() {

        var i = 0

        while (i < 256) {
            if (counter[i] > 1) {
                print("${i.toChar()}  ")
            }
            i++
        }
    }

}