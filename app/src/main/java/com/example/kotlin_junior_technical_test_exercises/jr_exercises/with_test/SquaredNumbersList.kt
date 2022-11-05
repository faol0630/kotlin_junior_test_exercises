package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {

    val numberList: List<Any> =
        listOf(2, true, "Word1", 5, 3, "Word2", 7, 12, false, 9, 8, "Word3", 6, 15)
    val squaredNumberList1: MutableList<Int> = mutableListOf()

    val squaredNumbersList = SquaredNumbersList()
    squaredNumbersList.listC = numberList
    squaredNumbersList.list2C = squaredNumberList1
    println(squaredNumbersList)

}

class SquaredNumbersList {

    var listC: List<Any>? = null
    var list2C: MutableList<Int>? = null

    fun squaredNumberList1(list: List<Any>, list2: MutableList<Int>): MutableList<Int> {

        var squaredElement: Int

        list.indices.forEach { i ->
            if (list[i] is Int) {
                squaredElement = list[i].toString().toInt() * list[i].toString().toInt()
                list2.add(squaredElement)
            }
        }
        return list2
    }

    override fun toString(): String {
        return squaredNumberList1(listC!!, list2C!!).toString()
    }
}
