package com.leeha.study.kotlin.chapter05.section4.prisecon

class Person(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) {

    // 2. 프로퍼티 할당
    val fName = println("[Property] Person fName: $firstName")

    // 3. 초기화 블록 호출
    init {
        println("[init] Person init block")
    }

    // 1. 생성자 호출
    constructor(
        firstName: String, age: Int,
        out: Unit = println("[Secondary Constructor] Parameter")
    ) : this(firstName) {
        println("[Secondary Constructor] Body: $firstName, $age")
    }
}

fun main() {
    var p1 = Person("Kildong", 30)
    println()
    val p2 = Person("Dooly")
}