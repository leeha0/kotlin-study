package com.leeha.study.kotlin.chapter02.section4

fun main() {
    val number1 = 5
    val number2 = -5

    println(number1 shr 1) // 2
    println(number1 ushr 1) // 2
    println(number2 shr 1) // -3, 부호 비트 유지
    println(number2 ushr 1) // 2147483645, 부호 비트 변경
}