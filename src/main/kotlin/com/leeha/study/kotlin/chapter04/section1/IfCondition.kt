package com.leeha.study.kotlin.chapter04.section1

fun main() {
    val a = 12
    val b = 7

    // 블록과 함께 사용
    val max = if (a > b) {
        println("a 선택")
        a // 마지막 식이 반환되어 max에 할당
    } else {
        println("b 선택")
        b // 마지막 식이 반환되어 max에 할당
    }

    println(max)
}