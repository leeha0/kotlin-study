package com.leeha.study.kotlin.chapter03.section3

fun main() {
    var result: Int
    // 일반 변수에 람다식 할당
    // (Int, Int) -> Int에 의해 Int형으로 추론
    val multi = { x: Int, y: Int -> x * y }
    // 람다식이 할당된 변수는 함수처럼 사용 가능
    result = multi(10, 20)
    println(result)
}