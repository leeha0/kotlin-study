package com.leeha.study.kotlin.chapter06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        // 조건에 맞을 경우 값 변경
        newValue > oldValue
    }

    println(max)
    max = 10
    println(max)
    // 조건에 맞지 않아 값 저장하지 않음
    max = 5
    println(max)
}