package lesson_4

const val TABLES = 13

fun main() {
    val tablesToday = 13
    val tablesTomorrow = 9

    val resultToday: Boolean = tablesToday < TABLES
    val resultTomorrow: Boolean = tablesTomorrow < TABLES

    println("Доступность столиков на сегодня: $resultToday\nДоступность столиков на завтра: $resultTomorrow")
}