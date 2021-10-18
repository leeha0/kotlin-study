package com.leeha.study.kotlin.chapter02.section2

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    // 세이프 콜(?.)과 엘비스 연산자(?:) 사용
    println("str1: $str1 length: ${str1?.length ?: -1}")
}