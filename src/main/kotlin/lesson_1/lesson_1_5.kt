package lesson_1

fun main() {
    val seconds = 6480
    val SIXTY = 60


    val min = (seconds / SIXTY) - SIXTY
    val hour = seconds / 3600
    val result = String.format("%02d:%02d:%02d", hour, min, 0)

    println(result)

}