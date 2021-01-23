package Class

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/18
 * Time: 19:03
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


class Djur(sort: String, antalBen: Int) {
    var sort: String = sort
        get() {
            return field
        }
        set(value) {
            sort = value
        }

    var antalBen: Int = antalBen
        get() {
            return field
        }
        set(value) {
            antalBen = value
        }

    fun printDjuretsSort() {
        println("Djurets sort: $sort")
    }

    fun printAntalBen() {
        println("Antal ben: $antalBen")
    }

    fun printAllInfo() {
        println("Djurets sort: $sort\nAntal ben: $antalBen")
    }


}

fun main() {
    var dog = Djur("Dog", 4)
    var cat = Djur("Cat", 4)
    var monkey = Djur("Monkey", 2)
    var snake = Djur("Snake", 0)

    var animalList = listOf(dog,cat,monkey,snake)
    for(animal in animalList) {
        println(animal.sort)
    }

    var animalSet = setOf(dog,dog,cat,monkey,monkey,snake)
    var animalSet2 = setOf(dog,cat,monkey,snake)
    var animalSet3 = setOf(dog,monkey,snake)

    animalSet.forEach{animal -> println(animal.sort)}

    println(animalSet.equals(animalSet2))
    println(animalSet.equals(animalSet3))

    var animalMap = mapOf("dog" to dog, "cat" to cat, "monkey" to monkey, "snake" to snake)
    for((key, value) in animalMap) {
        println("$key: ${value.printAllInfo()}")
    }

    animalMap.forEach{
        animal, i -> println("$animal: ${i.printAllInfo()}")
    }

    println(animalList.toString())
    println(animalList.joinToString(separator = "*"))



}

