package `02ExpressionStatement`

fun main() {
    val openOffice = 7
    val now = 8

    // statemant
//    if (now > openOffice)
//        print("Office already open")
//    else
//        print("Office close")

    //expression
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

}