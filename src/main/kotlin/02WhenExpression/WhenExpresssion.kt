package `02WhenExpression`

fun main() {
    val hari = "Minggu"

    val aktivitas = when(hari) {
        "Senin" -> "Kerja"
        "Sabtu" -> "Belajar"
        "Minggu" -> "Libur"
        else -> "Kuliah"
    }

    println(aktivitas)
}