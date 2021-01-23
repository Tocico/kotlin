package Rekursion

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/19
 * Time: 20:32
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
 fun main() {

    tailrec fun getInterest(amount: Double, years: Int, interest: Double) : Double =
         if(years == 0) amount
         else getInterest(amount + amount * interest /100, years - 1, interest)


    println(getInterest(100.0, 5, 10.0))
 }