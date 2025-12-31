package `01IfStatement`

fun main() {
    val pendapatan = 9000
    val pengeluaran = 9000

    val pemberitahuan = if (pendapatan == pengeluaran) {
        "Impas"
    } else if (pendapatan >= pengeluaran) {
        "Untung atau Impas"
    } else {
        "rugi"
    }
    println(pemberitahuan)
}