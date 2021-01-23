package Övning1

/**
 * Created by Toshiko Kuno
 * Date: 2021/01/12
 * Time: 10:38
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
    
    
    
fun main() {
    println(enoughTime(90, 30, 20, 0, 20, 30))
    println(enoughTime(90, 30, 20, 45, 21, 15))
    println(enoughTime(90, 30, 20, 30, 21, 15))
    println(enoughTime(90, 30, 20, 15, 21, 30))
    println(enoughTime(90, 80, 20, 0, 20, 30))
}

fun getProgramMinutes(startH: Int, startM: Int, stopH: Int, stopM: Int) :Int{
    val deltaH = stopH - startH
    val deltaM = stopM - startM
    return 60 * deltaH + deltaM
}

fun lengthLeftInMinutes(fullLen: Int, takenLen: Int): Int {
    return fullLen - takenLen
}

fun doesProgramFitVideoTape(lenVideo: Int, lenProgram: Int) : Boolean {
    return lenVideo - lenProgram >= 0
}

fun enoughTime(fullLen: Int, takenLen: Int, startH: Int, startM: Int, stopH: Int, stopM: Int) :Boolean {
    val plen = getProgramMinutes(startH, startM, stopH, stopM)
    val vLen = lengthLeftInMinutes(fullLen, takenLen)
    return doesProgramFitVideoTape(vLen, plen)
}

