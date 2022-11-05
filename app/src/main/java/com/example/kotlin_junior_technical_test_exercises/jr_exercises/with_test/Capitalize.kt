package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val capitalize = Capitalize()
    capitalize.classString = "words without capital letters"
    println(capitalize)
}

class Capitalize {

    var classString: String? = null

    fun capitalInitialLetter(string1: String): String {
        val newString = string1.split(" ")//leave space to divide into words

        val result = mutableListOf<String>()

        for (i in newString.indices) {
            result.add(newString[i].capitalize())
        }
        return result.toString()
            .replace(",", "")
            .replace("[", "")
            .replace("]", "")
    }

    override fun toString(): String = capitalInitialLetter(classString!!)

}