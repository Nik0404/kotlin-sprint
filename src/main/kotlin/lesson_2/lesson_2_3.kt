package lesson_2

fun main() {
    var hour = 9
    var minutes = 39
    val fullTime = 457

    var sHour = fullTime / 60
    var sMin = fullTime - sHour * 60

    hour += sHour
    minutes += sMin

    val newMin = hour * 60 + minutes
    sHour = newMin / 60
    sMin = newMin - sHour * 60

    val result = String.format("%02d:%02d", sHour, sMin)
    println(result)
}