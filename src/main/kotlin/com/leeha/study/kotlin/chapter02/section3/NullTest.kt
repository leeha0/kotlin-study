package com.leeha.study.kotlin.chapter02

fun main() {
    nullTest1() // null을 허용하지 않는 타입
    nullTest2() // null을 허용하는 타입
    nullTest3() // null을 허용하는 타입의 멤버 변수 접근
    nullTest4() // null을 허용하는 타입의 세이프 콜 접급
    nullTest5() // null을 허용하는 타입의 Nun-Null 단정문 접근
    nullTest6() // null을 허용하는 타입의 조건식을 통한 상태 검사
}

fun nullTest1() {
    var str1: String = "Hello Kotlin"
    // str1 = null // 오류 발생! null을 허용하지 않는다
    println("str1: $str1")
}

fun nullTest2() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1")
}

fun nullTest3() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    // println("str1: $str1 length: ${str1.length}") // 오류 발생! null을 허용하면 length가 실행될 수 없다
}

fun nullTest4() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length}") // 세이프 콜을 사용하여 안전하게 호출
}

fun nullTest5() {
    var str1: String? = "Hello Kotlin"
    // str1 = null
    println("str1: $str1 length: ${str1!!.length}") // NPE 강제 발생
}

fun nullTest6() {
    var str1: String? = "Hello Kotlin"
    // str1 = null
    // 조건식을 통해 null 상태 검사
    val len = if(str1 != null) str1.length else -1
    println("str1: $str1 length: ${len}") // NPE 강제 발생
}