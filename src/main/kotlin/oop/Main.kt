import oop.Ayam
import oop.Hewan
import oop.Kucing

fun main() {
    val hewan = Hewan()
    hewan.makan
    hewan.buangAir

    val kucing = Kucing()
    print(kucing.isMamal)
    kucing.makan()

    val ayam = Ayam()
    println(ayam.isMamal)
    ayam.makan()
}
