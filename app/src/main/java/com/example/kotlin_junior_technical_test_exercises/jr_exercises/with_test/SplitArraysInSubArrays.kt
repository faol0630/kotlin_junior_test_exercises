package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {
    val splitArraysInSubArrays = SplitArraysInSubArrays()
    splitArraysInSubArrays.splitList(splitArraysInSubArrays.languagesList, 3)
}

class SplitArraysInSubArrays {

    var languagesList = listOf(
        "PHP",
        "Javascript",
        "Go",
        "Rust",
        "Java",
        "C",
        "Python",
        "Kotlin",
        "Pascal",
        "C++",
        "Latino",
        "Matlab",
        "Cobol",
        "R",
        "Visual basic",
        "C#",
        "Fortran",
        "Matlab",
        "Clojure",
        "Ada",
        "Erlang"
    )

    fun splitList(list: List<String>, subListSize: Int) {
        println("Original list:")
        println(list)

        val listOfLists: MutableList<List<String>> = mutableListOf()

        for (i in list.indices step subListSize) {
            if (list.size - i >= subListSize) {
                val partOfTheList = list.subList(i, i + subListSize)
                listOfLists.add(partOfTheList)
                println(partOfTheList)
            } else {
                val newSubListSize = list.size - i
                val lastPartOfTheList = list.subList(i, i + newSubListSize)
                listOfLists.add(lastPartOfTheList)
                println(lastPartOfTheList)
            }

        }
        println("List of lists: ")
        println(listOfLists)

    }

}