package com.leeha.study.kotlin.chapter05.section5.internal

internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1
    }

    fun access() {
        icFunc()
    }
}

class Other {
    // internal 접근 지시자를 동일하게 적용해야 함
    internal var ic = InternalClass()
    fun test() {
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}