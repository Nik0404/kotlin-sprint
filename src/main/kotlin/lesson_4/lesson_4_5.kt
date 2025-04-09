package lesson_4

fun main() {
    val isShipDamage = readln().toBoolean()
    val crewPersons = readln().toInt()
    val countBox = readln().toInt()
    val isWeather = readln().toBoolean()

    println(
        "корабль может отплыть? ${
            (isShipDamage == true && (crewPersons >= 50 && crewPersons <= 70) && (countBox > 50) &&
                    (isWeather == true || isWeather == false)) ||
                    (isShipDamage == false && crewPersons == 70 && isWeather == true && countBox >= 50)
        }"
    )
}