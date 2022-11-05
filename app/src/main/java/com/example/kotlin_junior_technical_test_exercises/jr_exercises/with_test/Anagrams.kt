package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test

fun main() {

    val anagrams = Anagrams()
    println(anagrams.checkAnagrams("Amor", "Roma"))
//    println(anagrams.checkAnagrams("Sergio", "Riesgo"))
//    println(anagrams.checkAnagrams("Agranda", "Granada"))
//    println(anagrams.checkAnagrams("Calienta", "Alicante"))
//    println(anagrams.checkAnagrams("Prisa", "Paris  "))

}

class Anagrams {

    fun checkAnagrams(word1: String,word2: String) : Boolean{

        val newWord1 =
            word1.lowercase().split("").sorted().toString().replace(",", "").replace(" ", "")
        val newWord2 =
            word2.lowercase().split("").sorted().toString().replace(",", "").replace(" ", "")

        return  newWord1 == newWord2

    }
}