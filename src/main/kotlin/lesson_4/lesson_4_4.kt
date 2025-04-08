package lesson_4

fun main() {
    val day = 5
    val firstGroup = (day % 2 != 0)
    val secondGroup = (day % 2 == 0)

    val result = """
        Упражнения для рук:    ${firstGroup}
        Упражнения для ног:    ${secondGroup}
        Упражнения для спины:  ${secondGroup}
        Упражнения для пресса: ${firstGroup}
    """.trimIndent()

    print(result)
}