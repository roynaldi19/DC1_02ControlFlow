package `04WhileDoWhile`

fun main() {
    print("Masukan Counter: ")
    var counter = readln().toInt()
    if (counter <= 10) {
        while (counter <= 10) {
            println("Hello $counter")
            counter++
        }
    } else {
        println("Inisialisai counter terlalau besar dan peruulangan tidak di lakukan")
    }
}