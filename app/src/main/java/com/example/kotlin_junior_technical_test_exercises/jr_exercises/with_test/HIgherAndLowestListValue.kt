package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {

    val numberList = listOf(34, 12, 56, 11, 81, 17, 6, 23, 88, 46, 28, 21, 91, 14)

    val values = HigherAndLowestListValue()
    values.listC = numberList
    println(values)
    values.showLowestAndHigher()

}

class HigherAndLowestListValue() {

    var listC: List<Int>? = null

    fun getHigherAndLowestValue(list: List<Int>): String {

        val newList = list.sorted()

        return "Lowest value: ${newList[0]} Higher value: ${newList[newList.size - 1]}"

    }

    override fun toString(): String = getHigherAndLowestValue(listC!!)

    //-----------------------

    private fun getHigherAndLowestValue2(list: List<Int>): String {

        var lowest = list[0]
        var higher = list[0]

        list.indices.forEach { i -> //for (i in list.indices)
            if (list[i] < lowest) {
                lowest = list[i]
            } else if (list[i] > higher) {
                higher = list[i]
            }
        }
        return "Lowest value: $lowest Higher value: $higher"
    }

    fun showLowestAndHigher() { println(getHigherAndLowestValue2(listC!!)) }

}