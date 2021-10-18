package com.leeha.study.kotlin.chapter03.section3

fun main() {
    // 매개변수 없는 람다식 () -> {}
    // 매개변수와 화살표 생략 가능
    noParam({ "Hello World!" })
    // 소괄호 생략 가능
    noParam { "Hello World!" }
}

// 매개변수가 없는 람다식이 noParam 함수의 매개변수 out으로 지정됨
fun noParam(out: () -> String) = println(out())