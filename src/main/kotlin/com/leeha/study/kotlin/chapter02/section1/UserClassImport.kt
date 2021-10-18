package com.leeha.study.kotlin.chapter02.section1

// 사용자 클래스를 별칭으로 가져오기
import com.leeha.study.kotlin.chapter02.Person as User

fun main() {
    val user1 = User("Kildong", 30)
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}

class Person(val id: String, val name: String)