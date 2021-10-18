package com.leeha.study.kotlin.chapter03.section6

fun a() = b()

// 사용자 최상위 함수
fun b() = println("b")

// 사용자 최상위 함수
fun c() {
    // fun d() = e() // 지역 함수의 이름을 모름! Unresolved Reference

    // 지역 함수
    fun e() = println("e")
}

// 최상위 함수
fun main() {
    a()
    // e() // 지역 함수를 호출할 수 없음!
}