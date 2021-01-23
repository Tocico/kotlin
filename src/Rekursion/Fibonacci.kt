package Rekursion

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/23
 * Time: 22:12
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */



fun main() {

    tailrec fun fib(prevPrev: Int, prev: Int) {
        val next = prevPrev + prev
        println(next)
        if (next > 100) System.exit(0)
        fib(prev, next)
    }

    println(fib(1, 2))
}