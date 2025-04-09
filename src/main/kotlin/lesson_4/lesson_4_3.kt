package lesson_4

const val AIR = 20
const val SEASON = "зима"

fun main() {
    val isWeatherSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "зима"

    print(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (isWeatherSunny == true) && (isAwningOpen == true) && airHumidity == AIR && season != SEASON
        }"
    )
}