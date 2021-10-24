package com.leeha.study.kotlin.chapter06.section2

import kotlin.properties.Delegates

class User {
    // 프로퍼티 위임
    var name: String by Delegates.observable("NONAME") { property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main() {
    var user = User()
    user.name = "Kildong"
    user.name = "Dooly"
}
