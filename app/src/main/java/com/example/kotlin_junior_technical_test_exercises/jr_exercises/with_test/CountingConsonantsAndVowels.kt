package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val text1 = "This is a text to be used counting letters "
    val counting = CountingConsonantsAndVowels()
    counting.textC = text1
    println(counting) //Vowels: 13 .Consonants: 21

}

class CountingConsonantsAndVowels() {

    var textC: String? = null

    fun counting(text: String): String {

        var vowelsCounter = 0
        var consonantsCounter = 0
        val newText = text.lowercase().replace(" ", "")

        for (i in newText.indices) {

            if (
                newText[i].toString() == "a" ||
                newText[i].toString() == "e" ||
                newText[i].toString() == "i" ||
                newText[i].toString() == "o" ||
                newText[i].toString() == "u"
            ) {
                vowelsCounter++
            } else {
                consonantsCounter++
            }
        }
        return "Vowels: $vowelsCounter .Consonants: $consonantsCounter"

    }

    override fun toString(): String = counting(textC!!)
}