package lesson_1

fun main() {
    val seconds = 6480

    val min =  (seconds / 60) - 60
    val hour = seconds / 3600

    println("0$hour:$min:00")

}