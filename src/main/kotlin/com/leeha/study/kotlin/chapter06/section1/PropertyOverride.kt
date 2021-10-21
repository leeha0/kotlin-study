package com.leeha.study.kotlin.chapter06.section1

open class First {
    open val x: Int = 0
        get() {
            println("First x")
            return field
        }
    val y: Int = 0
}

class Second : First() {
    // 상위 클래스의 프로퍼티 오버라이드
    override val x: Int = 0
        get() {
            println("Second x")
            return field + 3
        }
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}