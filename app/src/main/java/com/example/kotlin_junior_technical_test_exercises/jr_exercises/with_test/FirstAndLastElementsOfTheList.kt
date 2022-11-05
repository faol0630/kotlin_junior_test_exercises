package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {

    val numberList = listOf(45, 26, 17, 11, 62, 57, 23, 1, 5)
    val firstAndLast = mutableListOf<Any>()
    val firstAndLast2 = mutableListOf<Any>()

    val element = FirstAndLastElementsOfTheList()
    element.firstAndLast(numberList, firstAndLast)
    element.showNewList(firstAndLast)

    element.firstAndLast2(numberList, firstAndLast2)
    element.showNewList2(firstAndLast2)

}

class FirstAndLastElementsOfTheList {

    fun firstAndLast(list1: List<Any>, list2: MutableList<Any>) {
        list2.add(list1.first())
        list2.add(list1.last())
    }

    fun showNewList(list2: MutableList<Any>){ println(list2) }

    //------------------

    fun firstAndLast2(list1: List<Any>, list2: MutableList<Any>){

        list1.indices.forEach{ i -> //for (i in list1.indices)
            if (i == 0){
                list2.add(list1[i])
            }
            else if (i == list1.size - 1){
                list2.add(list1[i])
            }
        }
    }

    fun showNewList2(list2: MutableList<Any>){ println(list2) }

}