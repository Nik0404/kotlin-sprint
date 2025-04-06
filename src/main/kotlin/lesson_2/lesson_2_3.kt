package lesson_2

const val SIXTY = 60

fun main() {
    var hour = 9
    var minutes = 39
    val travelTime = 457

    val departureMin = (hour * SIXTY) + minutes
    val fullTime = departureMin + travelTime

    val sHour = fullTime / SIXTY
    val sMin = fullTime - sHour * SIXTY

    val result = String.format("%02d:%02d", sHour, sMin) //17:16
    println(result)
}