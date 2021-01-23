package Class

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/18
 * Time: 22:05
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
class Personnummer(var personnummer: String, var name: String) {

}

data class Personnummer2(var personnummer: String, var name: String)

fun main() {
    var p1 = Personnummer("1111111111", "Toshiko")
    var p2 = Personnummer2("1111111111", "Toshiko")

    println(p1.equals(p2))
}