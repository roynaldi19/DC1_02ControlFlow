package `04Range`

fun main() {
    val tenToOne = 10.downTo(1)
    if (17 in tenToOne) {
        println("Value available")
    } else {
        println("Value not available")
    }
}