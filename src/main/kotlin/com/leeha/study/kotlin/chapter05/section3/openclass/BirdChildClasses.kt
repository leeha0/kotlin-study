package com.leeha.study.kotlin.chapter05.section3.openclass

// 상속 가능한 클래스 선언
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

// 주 생성자를 통한 상속
class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {

    // 멤버 메서드 추가
    fun singHitone() = println("Happy Song!")
}

// 부 생성자를 통한 상속
class Parrot : Bird {
    // 멤버 프로퍼티 추가
    val language: String

    constructor(name: String, wing: Int, beak: String, color: String, language: String) : super(
        name,
        wing,
        beak,
        color
    ) {
        this.language = language
    }

    // 멤버 메서드 추가
    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")
    val lark = Lark("mylank", 2, "long", "brown")
    val parrot = Parrot("myparrot", 2, "short", "multiple", "korean")

    println("Coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    lark.singHitone()
    parrot.speak()
    lark.fly()
}
