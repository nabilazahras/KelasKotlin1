fun main(){
    var hargaParkir = Float
    var jamParkir = Int

    jamParkir = 26

    val hargaAwal = 1
    val hargaSelanjutnya = 0.5
    val hargaMaksimal = 15

    if (jamParkir <= 5) {
        hargaParkir = (jamParkir * hargaAwal).toFloat()
    }else if ((jamParkir> 5) && (jamParkir <24 )) {
            hargaParkir= (5 + ((jamParkir-5)*hargaSelanjutnya)).toFloat()
        } else if (jamParkir = 24) {
            hargaParkir = (hargaMaksimal).toFloat()
        } else
        hargaParkir= (15 + ((jamParkir-24)*hargaSelanjutnya)).toFloat()

    println("Jam Parkir: $jamParkir ")
    println("Harga Parkir: $hargaParkir ")
}