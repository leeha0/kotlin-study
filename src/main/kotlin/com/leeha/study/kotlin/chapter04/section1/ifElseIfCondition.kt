package com.leeha.study.kotlin.chapter04.section1

fun main() {
    print("Enter the score: ")
    // 입력 값이 실수형이 아닐경우 null을 검사하거나 non-null 단정 기호(!!.)를 사용해야 한다
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0) {
        grade = 'A'
    } else if (score >= 80.0 && score <= 89.9) {
        grade = 'B'
    } else if (score >= 70.0 && score <= 79.9) {
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}