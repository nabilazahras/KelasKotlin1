package oop

class Mobil(kapasitasTanki: Int) {
    var merk: String = "Honda"
        get() = field
        set(value) {
            field = "Rubah merk $value"
        }

    val tenaga = kapasitasTanki

    fun gas() {
        println("Gasss")
    }
}