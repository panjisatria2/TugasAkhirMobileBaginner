package soal_2

fun main() {
    val baris = 6
    for (i in 0 until baris) {
        for (j in 0 until baris - i) {
            print("* ")
        }
        println()
    }
    val baris2 = 6
    for (i in 1..baris2) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}