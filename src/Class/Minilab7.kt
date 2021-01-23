package Class

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/18
 * Time: 18:50
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */


class Triangle(i: Int, j: Int) {
    var i: Int = i
        get() {
            return field
        }
        set(value) {
            i = value
        }

    var j: Int = j
        get() {
            return field
        }
        set(value) {
            j = value
        }
}

fun main() {
    var triangle = Triangle(5, 8)
    println(triangle.i)
    println(triangle.j)
    println(triangle.i * triangle.j)
}
