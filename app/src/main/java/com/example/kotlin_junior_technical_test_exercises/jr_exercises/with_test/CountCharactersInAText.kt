package com.example.kotlin_junior_technical_test_exercises

import kotlin.jvm.JvmStatic

internal object Master1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val countCharacters = CountCharactersInAText()
        countCharacters.countCharactersInAText1("Count characters in this sentence")
        countCharacters.showResult(countCharacters.counter)
    }
}

class CountCharactersInAText {

    val counter = IntArray(256)
    //this array contains a list of 256 zeros [0,0,0,0,0,0,0....etc]

    fun countCharactersInAText1(text: String) {
        val length1: Int = text.length
        var i = 0
        while (i < length1) {
            counter[text[i].hashCode()] = counter[text[i].hashCode()] + 1
            i++
            //at this point the array will be left with numbers greater than zero where matches have been found
        }
    }

    fun showResult(counter: IntArray) {
        //showing results:
        var i = 0
        while (i < 256) {
            if (counter[i] != 0) {
                println(i.toChar().toString() + " : " + counter[i])//character : quantity
            }
            i++
        }
    }
}