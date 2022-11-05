package com.example.kotlin_junior_technical_test_exercises

fun main() {

    val daysList = listOf("Monday", "Tuesday", "Wednesday")
    val phrase = "String to list"

    val stringToList = StringToList()
    stringToList.phraseClass = phrase
    stringToList.stringToList1(phrase)
    println(stringToList)

    val listToString = ListToString()
    listToString.daysListC = daysList
    listToString.listToString1(daysList)
    println(listToString)
    listToString.printNewString(listToString.string1)
}

class StringToList {

    var phraseClass: String? = null

    fun stringToList1(phrase: String): List<String> {
        return phrase.split("")
    }

    override fun toString(): String {
        return stringToList1(phraseClass!!).toString()
    }
}

class ListToString {

    var daysListC: List<String>? = null


    var string1 = ""

    fun listToString1(list: List<String>): String {
        string1 = list.toString()
        return string1
    }

    override fun toString(): String {
        return listToString1(daysListC!!)
    }

    fun printNewString(string1: String) {
        println(
            string1.replace("[", "")
                .replace("]", "")
                .replace(",", "")
        )


    }


}