package `01Enumeration`

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main() {
    val colorRed = Color.RED
    println(colorRed)
}


