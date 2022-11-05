package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val palindrome = Palindrome("ana")
    println(palindrome)

    val palindrome2 = Palindrome2()
    println(palindrome2.palindrome("otto"))
}

class Palindrome(private val wordC: String) {

    fun palindrome1(word: String): Boolean = word.lowercase() == word.lowercase().reversed()

    override fun toString(): String = palindrome1(wordC).toString()
}

class Palindrome2 {

    fun palindrome(word: String): Boolean {

        val newWord = StringBuilder()

        for (i in word.length - 1 downTo 0) {
            newWord.append(word[i])
        }
        return word.lowercase() == newWord.toString().lowercase()
    }

}