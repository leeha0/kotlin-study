package com.leeha.study.kotlin.chapter07.section1

interface Pet {
    // 추상 프로퍼티 (기본값을 갖지 않음)
    var category: String
    // val 프로퍼티의 경우 게터를 통해 기본값을 선언할 수 있다
    val message: String
        get() = "I'm your lovely pet!"
    var species: String

    // 추상 메서드
    fun feeding()

    // 일반 메서드
    fun patting() {
        println("Keep patting!")
    }
}

// 추상 프로퍼티와 메서드에는 override 키워드를 붙인다
class Cat(name: String, override var category: String) : Pet {
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Coco", "small")
    println("Pet Category: ${obj.category}")
    println("Pet Message Tags: ${obj.message}")
    obj.feeding()
    obj.patting()
}