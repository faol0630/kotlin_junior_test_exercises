package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {

    val citiesList = listOf(
        "Madrid",
        "San francisco",
        "Londres",
        "Ciudad Real",
        "Las Palmas",
        "Bogota",
        "Houston",
        "Casa Blanca"
    )
    val elements = ElementsWithTwoWords()
    elements.listC = citiesList
    println(elements)
    val newCitiesList = elements.getElementsWithTwoWords2(citiesList)
    println(newCitiesList)
}

class ElementsWithTwoWords{

    var listC: List<String>? = null

    //forEach
    private fun getElementsWithTwoWords(list: List<String>): List<String> {

        val newList: MutableList<String> = mutableListOf()

        list.forEach { i ->
            if (i.contains(" ")) {
                newList.add(i)
            }
        }
        return newList
    }

    override fun toString(): String = getElementsWithTwoWords(listC!!).toString()

    //filter
    fun getElementsWithTwoWords2(list: List<String>): List<String> {
        return list.filter { it.contains(" ") }
    }


}