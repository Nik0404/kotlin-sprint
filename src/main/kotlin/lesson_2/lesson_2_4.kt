package lesson_2

const val boost = 0.2
fun main() {
    val crystalOre = 7
    val ironOre = 11

    val crystalOreToBaff = (crystalOre * boost).toInt()
    val ironOreToBaff = (ironOre * boost).toInt()

    println("кристалическая руда с баффом $crystalOreToBaff")
    println("железная руда с баффом $ironOreToBaff")
}