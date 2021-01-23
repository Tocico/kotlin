package Rekursion

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/23
 * Time: 22:39
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
fun main() {
//    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    fun fib(prevPrev: Int, prev: Int, i : Int) {
        val next = prevPrev + prev
        when  {
            (i == 0) -> println(1)
            (i == 1) -> println(2)
            (i-2 == 0) -> println(next)
        }
        if (i <= 2) System.exit(0)
        fib(prev, next, i -1)
    }

    println(fib(1, 2, 6))
}
