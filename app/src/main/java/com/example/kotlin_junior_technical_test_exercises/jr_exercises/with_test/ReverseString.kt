package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val reverseString = ReverseString()
    reverseString.wordC = "Words words words"
    println(reverseString)

    val reverseString2 = ReverseString2()
    reverseString2.reverseList()
    reverseString2.printNewWord()

    val reverseString3 = ReverseString3("Phrase")
    println(reverseString3)

}

class ReverseString {

    var wordC: String? = null

    fun reverseStringF(word: String): String = word.reversed()

    override fun toString(): String = reverseStringF(wordC!!)
}

class ReverseString2 {

    private var word2 = "This is the sentence that we are going to reverse"

    //convert string to character-separated list (each letter is an element):
    private var myList: List<String> = word2.split(" ")
    //if there isn't space, it's divided by characters
    //if there is a space it's divided by words


    //new word:
    private var newText: StringBuilder = StringBuilder()

    fun reverseList() {
        println(myList)
        for (i in myList.size - 1 downTo 0) {
            newText.append("${myList[i]} ")
        }
    }

    fun printNewWord() {
        println(newText.toString())
    }
}

class ReverseString3(private val wordClass: String) {

    private fun reversePhrase(phrase: String): String {

        val newWord3 = StringBuilder()

        for (i in phrase.length - 1 downTo 0) {
            newWord3.append(phrase[i])
        }
        return newWord3.toString()
    }

    override fun toString(): String = reversePhrase(wordClass)

}