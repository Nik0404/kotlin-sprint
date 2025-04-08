package lesson_4

const val AIR = 20
const val SEASON = "зима"

fun main() {
    val weather = true
    val awing = true
    val air = 20
    val season = "зима"

    print("Благоприятные ли условия сейчас для роста бобовых? ${weather && awing && air == AIR && season != SEASON}")
}