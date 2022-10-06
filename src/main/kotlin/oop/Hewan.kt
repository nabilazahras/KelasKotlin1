package oop

open class Hewan {
    open val kaki = 2
    var mata = 2

    fun makan () {
        println("nyam nyam")
    }

    fun buangAir() {
        print("zzzzzz")
    }
}

class Kucing : Hewan() {
    override val kaki = 4
    val isMamal = true
}

class KakaTua : Hewan() {
    val isBird = true
}

class Ayam : Hewan() {
    val isMamal = false
}