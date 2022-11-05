package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main() {

    val listOne = listOf(1, 5, 7, 2, 9, 14, 16, 21, 22)
    val listTwo = listOf(3, 8, 1, 21, 15, 9, 4, 11, 19)

    val commonElements = CommonElementsBetweenTwoArrays()
    commonElements.listOneC = listOne
    commonElements.listTwoC = listTwo
    println(commonElements)
    val commonElements2 = commonElements.getCommonsElements2(listOne, listTwo)
    println(commonElements2)

}

class CommonElementsBetweenTwoArrays {

    var listOneC: List<Int>? = null
    var listTwoC: List<Int>? = null

    //forEach:
    private fun getCommonsElements(listOne: List<Int>, listTwo: List<Int>): MutableList<Int> {

        val commonElementsList = mutableListOf<Int>()

        listOne.indices.forEach { i -> //for (i in listOne.indices)
            if (listTwo.contains(listOne[i])) {
                commonElementsList.add(listOne[i])
            }
        }
        return commonElementsList
    }

    override fun toString(): String = getCommonsElements(listOneC!!, listTwoC!!).toString()

    //filter:
    fun getCommonsElements2(listOne: List<Int>, listTwo: List<Int>): List<Int> {
        return listOne.filter { i -> listTwo.contains(i) }
    }

}