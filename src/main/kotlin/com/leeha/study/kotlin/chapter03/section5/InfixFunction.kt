package com.leeha.study.kotlin.chapter03.section5

fun main() {
    // 일반 표현법
    // val multi = 3.multiple(10)

    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")
}

// Int 클래스 확장 함수
// infix 선언하여 중위 표현법 적용
infix fun Int.multiply(x: Int): Int {
    return this * x
}