package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val wordInPhrase = WordInPhrase()
    println(wordInPhrase)
    wordInPhrase.showQuantity()
}

class WordInPhrase {

    private var word1 = "a"
    private var phrase1 = "This is a phrase to search for a chosen word"

    fun wordInPhrase1(word: String, phrase: String): Boolean {

        val newList = phrase.split(" ")

        return newList.contains(word)
    }

    fun wordInPhrase2(word: String, phrase: String): Int {

        val newList = phrase.split(" ")

        var counter = 0

        newList.indices.forEach { i ->
            if (newList[i] == word) {
                counter++
            }
        }
        return counter
    }

    fun showQuantity() {
        println("Times: ${wordInPhrase2(word1, phrase1)}")
    }

    override fun toString(): String {
        return wordInPhrase1(word1, phrase1).toString()
    }
}