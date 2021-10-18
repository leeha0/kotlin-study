package com.leeha.study.kotlin.chapter02.section3

fun main() {
    val a: Int = 128
    val b = a
    println(a === b) // true (기본형으로 변환되어 동일한 값을 저장)

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // true (값만 비교하는 경우 동일)
    println(c === d) // false (값의 내용은 같지만 주소가 다름)
    println(c === e) // true  (값의 내용이 같고 주소도 같음)
}