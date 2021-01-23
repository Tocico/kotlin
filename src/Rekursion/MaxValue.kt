package Rekursion

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/23
 * Time: 11:08
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
fun main() {

    fun maxValue(list: List<Int>):Int {
        tailrec fun findMaxValue(maxValue: Int, count: Int) : Int {
            return if(count == -1) maxValue
            else findMaxValue(if(maxValue < list.get(count)) list.get(count) else maxValue, count - 1)
        }

            var max = Int.MIN_VALUE
       return findMaxValue(max, list.size - 1)
     }


    println(maxValue(listOf(3,6,10,9)))
}