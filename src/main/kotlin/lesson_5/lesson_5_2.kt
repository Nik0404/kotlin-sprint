package lesson_5

const val ADULT = 18

fun main() {
    print("введите ваш год рождения: ")
    val yearOfBirth = readln().toInt()
    val currentYear = 2025
    val result = currentYear - yearOfBirth

    val message = if (result >= ADULT) "Показать экран со скрытым контентом" else "back to main screen"
    println(message)
}