package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {
    val mixed = MixedListToStringList()
    mixed.mixedListToStringList(mixed.mixedList, mixed.stringsList)
    mixed.showStringList(mixed.stringsList)
}

class MixedListToStringList {

    var mixedList: MutableList<Any> =
        mutableListOf(1, 4, "Red", false, "12", "Yellow", "14", "Blue", true, 17, 23, 27, "Orange")
    var stringsList: MutableList<String> = mutableListOf()

    fun mixedListToStringList(list: MutableList<Any>, list2: MutableList<String>) {
        list.forEach { i -> list2.add(i.toString()) }
    }

    fun showStringList(list: MutableList<String>) { println(list) }
}
