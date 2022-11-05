package com.example.kotlin_junior_technical_test_exercises.jr_exercises.with_test


fun main(){
    val removeStrings = RemoveStringsFromArrayList()
    removeStrings.removeStrings(removeStrings.myList)
    println(removeStrings.showOriginalList(removeStrings.myList))
    println(removeStrings.showNumberList(removeStrings.newIntList))
    println(removeStrings.showStringList(removeStrings.newStringList))
}
class RemoveStringsFromArrayList {

    var myList : MutableList<Any> = mutableListOf(2, 5, "Word1", 87, 12, "Word2", 112, 31, 33, "Word3", "Word4", 99)
    var newIntList : MutableList<Int> = mutableListOf()
    var newStringList : MutableList<String> = mutableListOf()

    fun removeStrings(list: MutableList<Any>){
        for (i in list){
            if (i is Int){// checking type
                newIntList.add(i)
            }else{
                newStringList.add(i.toString())
            }
        }
    }

    fun showOriginalList(list: MutableList<Any>): MutableList<Any>{
        return list
    }

    fun showNumberList(list: MutableList<Int>): MutableList<Int>{
        return list
    }

    fun showStringList(list: MutableList<String>): MutableList<String>{
        return list
    }

}
