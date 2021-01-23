package Rekursion

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/23
 * Time: 21:36
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
fun main() {
    tailrec fun paranthesisCount(text: String, count: Int): Int {
        if(text.count() == 0)return count
        return when(text.first()) {
            '(' -> paranthesisCount(text.takeLast(text.count() - 1), count - 1)
            ')' -> paranthesisCount(text.takeLast(text.count() - 1), count + 1)
            else -> paranthesisCount(text.takeLast(text.count() - 1), count)
        }
    }

    fun areParanthesisEqual(text: String) : Boolean {
       return paranthesisCount(text, 0) == 0
    }

    println(areParanthesisEqual("((()))"))
    println(areParanthesisEqual("((()))))"))

}