package lesson_3

fun main() {
    var start = "E2"
    var end = "E4"
    var strokeNumber = 1

    val request = String.format("%s-%s;%s", start, end, strokeNumber)
    println(request)

    start = "D2"
    end = "D3"
    strokeNumber = 2

    println("$start-$end;$strokeNumber")
}