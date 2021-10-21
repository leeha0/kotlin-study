package com.leeha.study.kotlin.chapter05.section6.aggregation

// Pond 클래스를 생성하기 위해 Duck 객체가 필요
class Pond(_name: String, _members: MutableList<Duck>) {
    val name: String = _name
    // 멤버 프로퍼티에 포함
    val members: MutableList<Duck> = _members

    constructor(_name: String) : this(_name, mutableListOf<Duck>())
}

class Duck(val name: String)

fun main() {
    // Pond, Duck 클래스는 서로의 라이프 사이클에 영향을 주지 않음
    val pond = Pond("muFavorite")
    val duck1 = Duck("Duck1")
    val duck2 = Duck("Duck2")

    pond.members.add(duck1)
    pond.members.add(duck2)

    for (duck in pond.members) {
        println(duck.name)
    }
}