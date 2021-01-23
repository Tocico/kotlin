package Rekursion

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/23
 * Time: 11:35
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
fun main() {
    fun reverse(text: String): String {

        tailrec fun doReverse(word: String, reverseTxt: String, count: Int): String {
            return if(count == -1) return reverseTxt
            else doReverse(word, reverseTxt.plus(word.get(count)), count - 1)
        }
        return doReverse(text, "" ,text.length - 1)
    }

    println(reverse("HEEEEJ"))

    fun writeBackwards(ch :List<Char>) : Unit  {
        if (ch.size == 0) return
        writeBackwards (ch.takeLast(ch.count() -1))
        println(ch.first())  //not tailrec because of println last
    }

    println(writeBackwards(listOf('h','e','l','l','o')))
}