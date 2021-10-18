package com.leeha.study.kotlin.chapter03

fun main() {
    var result1 = sum1(3, 2)
    var result2 = sum1(6, 7)

    println(result1)
    println(result2)
}

fun sum1(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

fun sum2(a: Int, b: Int): Int {
    return a + b
}

// 중괄호 & 리턴문 생략 후 대입 연산자 사용
fun sum3(a: Int, b: Int): Int = a + b

// 매개 변수와 반환 값이 모두 Int형이므로 반환 값 생략
fun sum4(a: Int, b: Int) = a + b