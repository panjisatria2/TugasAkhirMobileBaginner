package soal_1.nomor5

class no_5 (val nama : String, val umur : Int, val plt : String, val sk : String){
    fun <T> datadiri (anda: T){
        println("Hai $anda,Nama saya Adalah $nama, Umur Saya $umur Tahun, Saya Adalah Mahasiswa di$plt," +
                "dan saat ini Saya Sedang Mengikuti StudyClub yaitu $sk")
    }
}