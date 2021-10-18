package com.leeha.study.kotlin.chapter03.section5.crossinline

fun main() {
    shortFunc(3) {
        println("First call: $it")
    }
}

// crossinline 키워드를 사용하면 out은 단순 람다식이되어 return문이 금지된다
inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    // 인라인 처리가 안되는 중첩된 람다식 함수로 return문이 금지된다
    nestedFunc { out(a) }
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}