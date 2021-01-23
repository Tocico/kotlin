package Class

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/18
 * Time: 22:31
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
class Rectangle(var width: Double, var height: Double)

fun Rectangle.area(): Double = width * height

fun Rectangle.perimeter(): Double = 2 * width + 2* height

fun String.doubleUp() = "$this$this"

fun String.printRepeat(i: Int) : String {
    var temp: String = ""
    for(i in 1..i) {
        temp += "$this"
    }
    return temp
}

fun main() {
    var r1 = Rectangle(height = 20.0, width = 30.0)
    println(r1.height)
    println(r1.area())


    println(r1.perimeter())

    println("Hi".doubleUp())
    println("Hi".printRepeat(5))
}