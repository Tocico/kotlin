package Rekursion

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/23
 * Time: 10:51
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    fun main() {

        fun sum(list: List<Int>) :Int{
            tailrec fun sumFun(sum: Int, count: Int): Int {
                return if(count == -1) sum
                else sumFun(sum + list[count], count -1)
            }
            return sumFun(0, list.size - 1)
        }

      println(sum(listOf(4,7,9,10,30)))
    }
    