package com.leeha.study.kotlin.chapter03.section5.noline

fun main() {
    shortFunc(3) { println("First call: $it") }
}

inline fun shortFunc(a: Int, noinline out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}