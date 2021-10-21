package com.leeha.study.kotlin.chapter05.section5.privatetest

// 다른 파일에서 접근 불가
private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 // 클래스 내부에서 접근 허용
    }

    fun access() {
        privateFunc() // 클래스 내부에서 접근 허용
    }
}

class OtherClass {
    // PrivateClass는 동일하게 private로 선언해야 한다
    private val opc = PrivateClass()
    fun test() {
        // 외부로 유출되지 않기 때문에 생성 가능
        val pc = PrivateClass()
    }

    private fun test2(): PrivateClass {
        // 외부로 유출되기 때문에 private로 선언해야 한다
        return PrivateClass()
    }
}

fun main() {
    // main() 에서는 생성 가능
    val pc = PrivateClass()
    // private 프로퍼티, 메서드는 다른 클래스, main(), 최상위 함수에서 접근할 수 없다
    // pc.i
    // pc.privateFunc()
}

fun TopFunction() {
    // 최상위 함수에서는 생성 가능
    val tpc = PrivateClass()
}