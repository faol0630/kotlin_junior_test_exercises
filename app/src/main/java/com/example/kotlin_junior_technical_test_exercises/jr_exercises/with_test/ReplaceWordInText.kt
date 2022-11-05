package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val replaceWordInText = ReplaceWordInText("to", "Sample text to replace word")
    println(replaceWordInText)
}

class ReplaceWordInText(
    private val wordClass: String,
    private val textClass: String
) {


    fun replaceWord(word: String, text: String): String {

        val newText1 = text.split(" ").toMutableList()

        newText1.indices.forEach { i ->
            if (newText1[i] == word) {
                newText1[i] = "-Censured-"
            }
        }

        return newText1.joinToString(" ")

    }

    override fun toString(): String = replaceWord(wordClass, textClass)
}