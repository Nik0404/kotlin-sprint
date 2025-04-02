package lesson_2

fun main() {
    val permanentEmployees = 50
    val zpPermanentEmployees = 30000.0
    val internal = 30
    val zpInternal = 20000.0

    val summZpPermanentEmployees = permanentEmployees * zpPermanentEmployees
    val fullZp = (internal * zpInternal) + summZpPermanentEmployees
    val averageSalary = (summZpPermanentEmployees + (internal * zpInternal)) / (internal  + permanentEmployees)

    println(summZpPermanentEmployees)
    println(fullZp)
    println(averageSalary)


}