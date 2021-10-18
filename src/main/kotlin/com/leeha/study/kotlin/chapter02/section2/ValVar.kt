package com.leeha.study.kotlin.chapter02.section2

fun main() {
    val number = 10 // 자료형 추론
    var language = "Korea"
    val secondNumber: Int = 20 // 명시적 자료형 선언
    language = "English" // var로 선언된 변수 값 재할당

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}