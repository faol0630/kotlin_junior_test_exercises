package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val trimSentence = TrimSentence()
    trimSentence.stringClass1 = "Paris, Roma, Madrid, Lisboa"
    println(trimSentence)
    trimSentence.showNewString("Paris, Roma, Madrid, Lisboa")
}

class TrimSentence {

    var stringClass1: String? = null

    fun trimString(string1: String): CharSequence {

        return string1.subSequence(0, 12)
    }

    override fun toString(): String {
        return trimString(stringClass1!!).toString()//prints from character 12 onwards
    }

    fun trimString2(string1: String): String {

        val newString = string1.split("")
        val result = newString.subList(0, 12)
        return result.toString()
            .replace(",", "")
            .replace("[", "")
            .replace("]", "")

    }

    fun showNewString(string1: String) {
        println(trimString2(string1))
    }

}