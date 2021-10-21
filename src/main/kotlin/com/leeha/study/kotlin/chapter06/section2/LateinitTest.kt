package com.leeha.study.kotlin.chapter06.section2

class Person {
    lateinit var name: String

    fun test() {
        // isInitialized: 프로퍼티 초기화 여부 검사
        // 콜론 2개(::): 프로퍼티 참조
        if (!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val kildong = Person()
    kildong.test()
    kildong.name = "Kildong" // 지연 초기화
    kildong.test()
    println("name = ${kildong.name}")
}