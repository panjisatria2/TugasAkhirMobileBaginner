package soal_1

class soal_5 (val nama : String,val umur : Int,val plt : String,val sk : String){
    fun <T> datadiri (param: T){
        println("Hai $param,Nama saya Adalah $nama, Umur Saya $umur Tahun, Saya Adalah Mahasiswa di$plt," +
                " dan saat ini Saya Mengikuti StudyClub yaitu $sk")
    }
}