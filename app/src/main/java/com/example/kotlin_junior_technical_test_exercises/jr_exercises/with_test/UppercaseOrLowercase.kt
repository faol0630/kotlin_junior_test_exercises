package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//if the string has more uppercase than lowercase, put everything in uppercase
//if the string has more lowercase than uppercase, put everything in lowercase

fun main() {
    val uppercaseOrLowercase = UppercaseOrLowercase()//18 , 9 upper, 9 lower
    uppercaseOrLowercase.stringClass1 = "HOUses and BUIldINgS"
    uppercaseOrLowercase.changeString(uppercaseOrLowercase.stringClass1!!)
    println(uppercaseOrLowercase)
}

class UppercaseOrLowercase() {

    var stringClass1: String? = null

    var result: String = ""
    var uppercaseCounterC = 0
    var lowercaseCounterC = 0

    fun changeString(string1: String) {
        for (i in string1.replace(" ", "")) {//iterating over elements

            if (i.toString() == i.toString().uppercase()) {
                uppercaseCounterC++
                println("Character: $i ,UpperCounter: $uppercaseCounterC")
            } else if (i.toString() == i.toString().lowercase()) {
                lowercaseCounterC++
                println("Character: $i ,LowerCounter: $lowercaseCounterC")
            }
        }
    }

    fun showResult(string1: String, uppercaseCounter: Int, lowercaseCounter: Int): String {

        result = if (uppercaseCounter > lowercaseCounter) {
            string1.uppercase()
        } else if (lowercaseCounter > uppercaseCounter) {
            string1.lowercase()
        } else {
            "The string has the same number of uppercase and lowercase characters"
        }

        return result
    }

    override fun toString(): String {
        return showResult(stringClass1!!, uppercaseCounterC, lowercaseCounterC)
    }

}