package com.example.anagramclusterizer

fun main() {
    while(true) {
        print("? ")
        val word: String = readln()
        if(word == "") {
            break
        }
        saveWords(word)
    }
    println(outputClusters())
}

fun outputClusters(): Int {
    return clusters.size
}

fun saveWords(word: String) {
    val sortedWord = word.toCharArray().sorted().joinToString("")
    clusters.add(sortedWord)
}


private val clusters = mutableSetOf<String>()