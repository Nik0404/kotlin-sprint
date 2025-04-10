package lesson_4

const val IS_SHIP_DAMAGE = true
const val IS_WEATHER = true
const val CREW_PERSONS_FIFTY = 50
const val CREW_PERSONS_FIFTY_SEVENTY = 70
const val COUNT_BOX_FIFTY = 50

fun main() {
    println("наличие повреждений корпуса? true / false")
    val isShipDamage = readln().toBoolean()
    val crewPersons = readln().toInt()
    val countBox = readln().toInt()
    println("погода благоприятна или неблагоприятна? true / false")
    val isWeather = readln().toBoolean()

    println(
        "корабль может отплыть? ${
            (isShipDamage == IS_SHIP_DAMAGE && (crewPersons >= CREW_PERSONS_FIFTY && crewPersons <= CREW_PERSONS_FIFTY_SEVENTY) &&
                    (countBox > COUNT_BOX_FIFTY) &&
                    (isWeather == IS_WEATHER || isWeather == !IS_WEATHER)) ||
                    (isShipDamage == !IS_SHIP_DAMAGE && crewPersons == CREW_PERSONS_FIFTY_SEVENTY &&
                            isWeather == IS_WEATHER &&
                            countBox >= CREW_PERSONS_FIFTY)
        }"
    )
}