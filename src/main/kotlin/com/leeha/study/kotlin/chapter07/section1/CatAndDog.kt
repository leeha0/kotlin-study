package com.leeha.study.kotlin.chapter07.section1

open class Animal(val name: String)

class Dog(name: String, override var category: String) : Animal(name), Pet {
    override var species: String = "doc"
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master {
    // 애완동물에 따라 오버로딩됨 (동물이 점점 늘어난다면? 그만큼 메서드를 많이 구현해야 한다)
    // fun playWithPet(dog: Dog) {
    //     println("Enjoy with my dog.")
    // }

    // fun playWithPet(cat: Cat) {
    //     println("Enjoy with my cat.")
    // }

    // 인터페이스로 통합
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}