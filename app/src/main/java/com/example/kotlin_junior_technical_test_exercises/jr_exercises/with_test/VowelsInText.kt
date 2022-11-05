package com.example.kotlin_junior_technical_test_exercises


fun main() {
    val phrase = "This text has several vowels"
    val validVowels = ValidVowels()
    validVowels.validVowels(phrase)

    val vowelsInText = VowelsInText(validVowels)
    println(vowelsInText.vowelsInText(phrase))
}

class ValidVowels {

    fun validVowels(text: String): Boolean {

        return text.contains("a") ||
                text.contains("e") ||
                text.contains("i") ||
                text.contains("o") ||
                text.contains("u")

    }

}

class VowelsInText(private var validVowels: ValidVowels) {

    fun vowelsInText(text: String): Int {

        if (validVowels.validVowels(text)) {

            var counter = 0

            text.indices.forEach { i ->
                if (
                    text[i].toString() == "a" ||
                    text[i].toString() == "e" ||
                    text[i].toString() == "i" ||
                    text[i].toString() == "o" ||
                    text[i].toString() == "u"
                ) {
                    counter++
                }
            }
            return counter
        } else {
            return 0
        }
    }

}
