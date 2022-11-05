package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

//Given a string return all possible substrings
fun main() {
    val substrings = Substrings("Paris")
    println(substrings)
}

class Substrings(private val stringC: String) {

    fun getAllSubstrings(stringF: String): MutableList<String>{

        val stringsList: MutableList<String> = mutableListOf()

        for (j in 0..stringF.length) {

            for (i in 0..stringF.length - 1 - j) {

                val final =  stringF.length - i
                stringsList.add(stringF.substring(j, final))
                //println("$j / $final / ${stringF.substring(j, final)}")

            }
        }
        return stringsList
    }

    override fun toString(): String = getAllSubstrings(stringC).toString()
}
