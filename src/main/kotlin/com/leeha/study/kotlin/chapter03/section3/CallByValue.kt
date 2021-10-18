package com.leeha.study.kotlin.chapter03.section3

fun main() {
    // 람다식 함수를 호출
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("callByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}