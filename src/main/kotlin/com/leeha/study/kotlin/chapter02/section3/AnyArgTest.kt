package com.leeha.study.kotlin.chapter02.section3

fun main() {
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any) {
    if (x is String) { // String형 형변환
        println("x is String: $x")
    }
    if (x is Int) { // Int형 형변환
        println("x is Int: $x")
    }
}