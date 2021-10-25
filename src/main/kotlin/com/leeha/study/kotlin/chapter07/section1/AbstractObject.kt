package com.leeha.study.kotlin.chapter07.section1

// 추상 클래스
abstract class Printer {
    // 추상 메서드
    abstract fun print()
}

// 객체 인스턴스
val myPrinter = object : Printer() {
    // 추상 메서드 구현
    override fun print() {
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}