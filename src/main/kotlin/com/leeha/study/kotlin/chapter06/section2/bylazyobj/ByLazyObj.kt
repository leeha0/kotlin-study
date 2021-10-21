package com.leeha.study.kotlin.chapter06.section2.bylazyobj

class Person(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    // 객체 지연 초기화
    // by lazy: 객체의 위임
    val person: Person by lazy {
        isPersonInstantiated = true
        Person("Kim", 23)
    }
    // 위임 변수를 활용한 초기화
    // lazy: 변수에 위임된 Lazy 객체 (value를 한 단계 더 거쳐야 한다)
    val personDelegate = lazy {
        Person("Hong", 40)
    }

    println("person Init: $isPersonInstantiated") // 초기화 시점
    println("personDelegate Init: ${personDelegate.isInitialized()}") // 초기화 시점

    println("person.name = ${person.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init: ${isPersonInstantiated}")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}