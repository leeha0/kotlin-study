package com.leeha.study.kotlin.chapter05.section6.composition

class Car(var name: String, val power: String) {
    // Car 클래스가 생성될 때 Engine 클래스가 생성 (생명주기 의존)
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    var car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}