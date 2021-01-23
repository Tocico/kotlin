package Class

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/18
 * Time: 18:14
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
class Sweets

class Animal {
    fun cat() = "Cat"
    var bark = "Meaw Meaw"
}

class Languages(name: String) {
    val languageName = name
}

fun main() {
    val sweets = Sweets()
    println(sweets)

    val animal = Animal()
    println(animal.cat())

    println(animal.bark)
    animal.bark = "Woooow"
    println(animal.bark)

    val languages1 = Languages("Java")
    println(languages1.languageName)

    val languages2 = Languages("JavaScript")
    println(languages2.languageName)

}
