package lesson_5

fun main() {
    val winningNumberOne = 1
    val winningNumberTwo = 33

    print("введите 1 число от 0 до 42: ")
    val numberOne = readln().toInt()

    print("введите 2 число от 0 до 42: ")
    val numberTwo = readln().toInt()

    val result =
        if (numberOne == winningNumberOne && numberTwo == winningNumberTwo ||
            numberOne == winningNumberTwo && numberTwo == winningNumberOne
        ) "Поздравляем! Вы выиграли главный приз!"
        else if (numberOne == winningNumberOne || numberTwo == winningNumberTwo ||
            numberOne == winningNumberTwo || numberTwo == winningNumberOne
        ) "Вы выиграли утешительный приз!"
        else "Неудача!"

    println(result)
    println("числа для победы: $winningNumberOne, $winningNumberTwo")
}