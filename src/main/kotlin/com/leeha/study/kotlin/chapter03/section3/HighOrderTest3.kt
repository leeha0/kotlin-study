package com.leeha.study.kotlin.chapter03.section3

fun main() {
    // 인자와 반환값이 없는 람다식 선언
    val out: () -> Unit = { println("Hello World!") }

    // 함수처럼 사용
    out()
    // 람다식이 들어있는 변수를 다른 변수에 할당
    val new = out
    // 함수처럼 사용
    new()
}