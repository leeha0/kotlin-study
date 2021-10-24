package com.leeha.study.kotlin.chapter06.section3

// object 키워드를 사용한 방식 (싱글톤)
object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")

    init {
        println("Init!")
    }
}

// 컴패니언 객체를 사용한 방식
class CCustomer {
    companion object {
        // 상수 표현
        const val HELLO = "hello"
        var name = "Joosol"

        @JvmField
        val HOBBY = Hobby("Football")

        @JvmStatic
        fun greeting() = println("Hello World!")
    }
}

class Hobby(val name: String)

fun main() {
    // 객체 생성없이 사용 가능
    OCustomer.greeting()
    OCustomer.name = "Dooly"
    println("name = ${OCustomer.name}")
    println(OCustomer.HOBBY.name)

    CCustomer.greeting()
    println("name = ${CCustomer.name}, HELLO = ${CCustomer.HELLO}")
    println(CCustomer.HOBBY.name)
}