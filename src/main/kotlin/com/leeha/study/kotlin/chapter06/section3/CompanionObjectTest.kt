package com.leeha.study.kotlin.chapter06.section3

class Person {
    var id: Int = 0
    var name: String = "Youngdeok"

    companion object {
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
    // println(Person.name) // 접근 불가
}