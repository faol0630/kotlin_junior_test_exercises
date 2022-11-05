package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val randomOrderString = RandomOrderString()
    randomOrderString.string1 = "Phrase to unscramble"
    println(randomOrderString)
}

class RandomOrderString {

    var string1: String? = null

    fun randomOrder(string1: String): String {
        val newFrase = string1.split("").shuffled()
        return newFrase.toString().replace(",", "")

    }

    override fun toString(): String = randomOrder(string1!!)

}