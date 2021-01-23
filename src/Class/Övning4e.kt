package Class

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/18
 * Time: 22:58
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
fun main() {
    var cat = Djur("cat", 4)
    var dog = Djur("dog", 4)

    fun makeSound(input: Djur): Unit {
        when(input.sort) {
            "cat" -> println("Mewwww")
            "dog" -> println("Bowbow")
        }
    }

    makeSound(cat)
    makeSound(dog)
}