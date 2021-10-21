package com.leeha.study.kotlin.chapter06.section1.customproperty

import java.lang.AssertionError

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    // 보조 프로퍼티
    private var tempName: String? = null
    var name: String = _name
        get() {
            // 임시 프로퍼티를 커스텀 게터에 사용할 수 있다
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    var user1 = User(1, "Kildong", 35)
    user1.name = ""
    println("user1.name = ${user1.name}")
}