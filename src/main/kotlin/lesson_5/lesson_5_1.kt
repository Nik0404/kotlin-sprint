package lesson_5

const val RESULT = 11

fun main() {
    val deffNumberA = 1
    val deffNumberB = 10
    println("для входа в приложения нужно решить математический пример $deffNumberA + $deffNumberB")

    print("введите 1 число: ")
    val numberA = readln().toInt()
    print("введите 2 число: ")
    val numberB = readln().toInt()

    val result = numberA + numberB

    if (result == RESULT) println("Добро пожаловать!")
    else println("Доступ запрещен")
}