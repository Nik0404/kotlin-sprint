package lesson_4

const val AIR = 20
const val SEASON = "зима"
const val IS_WEATHER_SUNNY = true
const val IS_AWNING_OPEN = true

fun main() {
    val isWeatherSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "зима"

    print(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (isWeatherSunny == IS_WEATHER_SUNNY) && (isAwningOpen == IS_AWNING_OPEN) && airHumidity == AIR && season != SEASON
        }"
    )
}