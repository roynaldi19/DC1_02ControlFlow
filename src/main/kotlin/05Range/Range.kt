package `05Range`

fun main() {
    val rangeInt1 = 1..10 step 2
    rangeInt1.forEach {
        println("$it")
    }
    println()

    val rangeInt2 = 1.rangeTo(10) step 2
    rangeInt2.forEach {
        println("$it")
    }
    println()

    val rangeInt3 = 10.downTo(1) step 2
    rangeInt3.forEach {
        println("$it")
    }
}