package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main(){
    val permutation = Permutation()
    println(permutation.checkPermutation(permutation.numberList))//true
}

class Permutation {

    val numberList = listOf(4, 3, 5, 2, 1)

    fun checkPermutation(list: List<Int> ): Boolean{

        var boolean1 = true

        val newList = list.sorted()

        newList.indices.forEach { i -> //for (i in newList.indices)
            boolean1 = (i + 1)  == newList[i]
            println("i = ${i + 1}  / list[$i] = ${newList[i]}")
        }
        return boolean1

    }
}