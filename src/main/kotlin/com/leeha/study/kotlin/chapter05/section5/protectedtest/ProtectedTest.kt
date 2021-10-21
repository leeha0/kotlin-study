package com.leeha.study.kotlin.chapter05.section5.protectedtest

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
    }

    fun access() {
        protectedFunc()
    }

    protected class Nested
}

class Derived : Base() {
    fun test(base: Base): Int {
        protectedFunc() // 접근 가능
        return i // 접근 가능
    }
}

fun main() {
    // 생성은 가능하나 protected 멤버에 접근 불가
    val base = Base()
    // base.i
    // base.protectedFunc()
    base.access()
}