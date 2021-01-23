package MiniLab

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/12
 * Time: 11:09
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
fun main() {
    val name = "Toshiko"
    println("Hej välkommen $name !")


    for (i in 20 downTo 1) {
        if(i % 2 == 0)
        print(i)
    }

    var l = 1
    var h = 10

    for(i in l..h) {
        println(i * i)
    }
    println()

    printMultiplication(7, 1, 10)
    println()
    println(isThisAPrime(22))
    println(isThisAPrime(13))
}

fun printMultiplication(table: Int, start: Int, stop: Int){
    for (x in start..stop) println(table * x)
}

fun isThisAPrime(primeCandidate: Int) : Boolean{
    for (x in 2..primeCandidate/2) {
        if (primeCandidate % x == 0) return false
    }
    return true
}
