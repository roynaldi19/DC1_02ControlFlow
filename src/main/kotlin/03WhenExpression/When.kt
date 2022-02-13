package `03WhenExpression`

fun main() {
    val value = 7
    val stringValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value tidak di temukan"
    }
    println(stringValue)
}