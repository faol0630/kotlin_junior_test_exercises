package com.example.kotlin_junior_technical_test_exercises

fun main() {
    val nonRepeatingCharacters = NonRepeatingCharacters()
    nonRepeatingCharacters.nonRepeat1("Phrase to find the unrepeated")
    nonRepeatingCharacters.showingNonRepeat1()

    val nonRepeatingCharacters2 = NonRepeatingCharacters2()
    println(nonRepeatingCharacters2)
}

class NonRepeatingCharacters {

    private var asciiList = IntArray(256)
    private var i = 0

    fun nonRepeat1(phrase: String) {

        val asciiList2 = IntArray(256)

        while (i < phrase.length) {
            asciiList2[phrase[i].hashCode()]++
            i++
        }
        asciiList = asciiList2
    }

    fun showingNonRepeat1() {

        i = 0

        while (i < 256) {
            if (asciiList[i] == 1) {
                print("${i.toChar()} ")
            }
            i++
        }
        println()
    }
}

class NonRepeatingCharacters2{

    var set1: Set<Int> = HashSet()

    val numList = arrayListOf(1, 4, 7, 1, 7, 3, 9, 2, 5, 8, 1)

    fun nonRepeat(list: List<Int>): Set<Int>{
        set1 = HashSet<Int>(list)
        return set1
    }

    override fun toString(): String = nonRepeat(numList).toString()
}