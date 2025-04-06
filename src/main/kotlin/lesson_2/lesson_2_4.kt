package lesson_2

const val ONE_HUNDRED_PRESENT = 100

fun main() {
    var boost = 20
    val crystalOre = 7
    val ironOre = 11

    boost = ONE_HUNDRED_PRESENT / boost

    val crystalOreToBaff = (crystalOre * boost).toInt()
    val ironOreToBaff = (ironOre * boost).toInt()

    println("кристалическая руда с баффом $crystalOreToBaff")
    println("железная руда с баффом $ironOreToBaff")
}