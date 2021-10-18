package com.leeha.study.kotlin.chapter02.section3

fun main() {
    isInt()
    isString()
    asString()
}

private fun isInt() {
    val num = 256

    // 스마트 캐스팅
    if (num is Int) {
        println(num)
    } else if (num !is Int) {
        println("Not a Int")
    }
}

fun isString() {
    var x: Any
    x = "Hello"

    // 스마트 캐스팅
    if (x is String) {
        println(x.length)
    }
}

fun asString() {
    val y = "스마트 캐스트"
    val x: String = y as String // null 일 경우 예외 발생
    // val x: String? = y as? String // null 이어도 예외가 발생하지 않음
}