package com.leeha.study.kotlin.chapter06.section2

interface Car {
    fun go(): String
}

class VanImpl(val power: String) : Car {
    override fun go(): String = "은 짐이 적재하여 $power 을 가집니다."
}

class SportImpl(val power: String) : Car {
    override fun go(): String = "은 경주용에 사용되며 $power 을 가집니다."
}

class CarModel(val model: String, impl: Car) : Car by impl {
    fun carInfo() {
        // 참조 없이 각 인터페이스 구현 크래스의 go()에 접근
        println("$model ${go()}")
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350마력"))

    // carInfo에 대한 다형성을 나타냄
    myDamas.carInfo()
    my350z.carInfo()
}