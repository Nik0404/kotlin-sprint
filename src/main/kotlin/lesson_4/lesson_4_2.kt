package lesson_4

const val FROM_WEIGHT = 35
const val UP_TO_WEIGHT = 100
const val VOLUME = 100

fun main() {
    val oneCargoWeight = 35
    val oneCargoVolume = 80
    val twoCargoWeight = 50
    val twoCargoVolume = 100

        println(
            "Груз с весом $oneCargoWeight кг и объемом $oneCargoVolume л соответствует категории 'Average': ${
                (oneCargoWeight > FROM_WEIGHT && oneCargoWeight <= UP_TO_WEIGHT) && oneCargoVolume < VOLUME
            }"
        )

    println(
        "Груз с весом $twoCargoWeight кг и объемом $twoCargoVolume л соответствует категории 'Average': ${
            (twoCargoWeight > FROM_WEIGHT && twoCargoWeight <= UP_TO_WEIGHT) && twoCargoVolume < VOLUME
        }"
    )
}