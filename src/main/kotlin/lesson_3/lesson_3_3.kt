package lesson_3

fun main() {
    val numbers = 6

    val multiplicationTable = """
        |$numbers * 1 = ${numbers * 1}
        |$numbers * 2 = ${numbers * 2}
        |$numbers * 3 = ${numbers * 3}
        |$numbers * 4 = ${numbers * 4}
        |$numbers * 5 = ${numbers * 5}
        |$numbers * 6 = ${numbers * 6}
        |$numbers * 7 = ${numbers * 7}
        |$numbers * 8 = ${numbers * 8}
        |$numbers * 9 = ${numbers * 9}
        
        """.trimMargin()

    println(multiplicationTable)
}