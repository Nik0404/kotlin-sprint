package lesson_1

const val SIXTY = 60
const val SECONDS_TO_HOUR = 3600

fun main() {
    val seconds = 6480

    val min = (seconds / SIXTY) - SIXTY
    val hour = seconds / SECONDS_TO_HOUR
    val result = String.format("%02d:%02d:%02d", hour, min, 0)

    println(result)

}