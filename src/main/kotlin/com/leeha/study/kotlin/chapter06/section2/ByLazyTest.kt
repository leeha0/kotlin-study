package com.leeha.study.kotlin.chapter06.section2

class LazyTest {
    init {
        println("init block")
    }

    // by: 프로퍼티 위임
    val subject by lazy {
        println("lazy initialized")
        "Kotlin Programming"
    }

    fun flow() {
        println("not initialized")
        println("subject one: $subject") // 초기화 시점
        println("subject two: $subject") // 이미 초기화된 메모리 값 사용
    }
}

fun main() {
    val test = LazyTest()
    test.flow()
}