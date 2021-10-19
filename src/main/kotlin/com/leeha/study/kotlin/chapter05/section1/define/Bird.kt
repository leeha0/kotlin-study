package com.leeha.study.kotlin.chapter05.section1.define

// 클래스 정의
class Bird {
    // 프로퍼티(속성)
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    // 메서드(함수)
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    // 객체 생성
    val coco = Bird()
    // 객체의 프로퍼티 값 할당
    coco.color = "blue"

    // 객체의 멤버 프로퍼티 값 읽기
    println("coco.color: ${coco.color}")
    // 객체의 멤버 메서드 사용
    coco.fly()
    coco.sing(3)
}