package com.leeha.study.kotlin.chapter05.section5.burglar

open class Car protected constructor(_year: Int, _model: String, _power: String, _wheel: String) {

    private var year: Int = _year
    public var model: String = _model
    protected open var power: String = _power
    internal var wheel: String = _wheel

    protected fun start(key: Boolean) {
        if (key) {
            println("Start the Engine!")
        }
    }

    class Driver(_name: String, _license: String) {
        private var name: String = _name
        var license: String = _license
        internal fun driving() = println("[Driver] Driving() - $name")
    }
}

class Tico(_year: Int, _model: String, _power: String, _wheel: String, var name: String, private var key: Boolean) :
    Car(_year, _model, _power, _wheel) {

    override var power: String = "50hp"
    var driver = Driver(name, "first class")

    constructor(_name: String, _key: Boolean) :
            this(2014, "basic", "100hp", "normal", _name, _key) {
        name = _name
        key = _key
    }

    fun access(password: String) {
        if (password == "gotico") {
            println("[Tico] access()")
            // println("super.year = ${super.year}") // 접근 불가
            println("super.model = ${super.model}")
            println("super.power = ${super.power}")
            println("super.wheel = ${super.wheel}")
            super.start(key)

            // println("driver.name = ${driver.name}") // 접근 불가
            println("driver.license = ${driver.license}")
            driver.driving()
        } else {
            println("You're a burglar")
        }
    }
}

class Burglar() {
    fun steal(anycar: Any) {
        if (anycar is Tico) {
            println("[Burglar] steal()")
            // println("anycar.power = ${anycar.power}") // 접근 불가
            // println("anycar.year = ${anycar.year}") // 접근 불가
            println("anycar.name = ${anycar.name}")
            println("anycar.model = ${anycar.model}")
            println("anycar.wheel = ${anycar.wheel}")

            println(anycar.driver.license)
            anycar.driver.driving()
            // anycar.start() // 접근 불가
            anycar.access("dontknow")
        } else {
            println("Nothing to steal")
        }
    }
}

fun main() {
    // var car = Car() // 생성 불가
    var tico = Tico("kildong", true)
    tico.access("gotico")

    val burglar = Burglar()
    burglar.steal(tico)
}