package com.leeha.study.kotlin.chapter06.section1.customgetest

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        // 외부에서 세터를 호출하지 않기 위해서 접근 지시자를 사용할 수 있다
        // private set(value)
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }

    var age: Int = _age
}

fun main() {
    val user1 = User(1, "Kildong", 35)
    user1.name = "coco"
    println("user1.name = ${user1.name}")
}