package lesson_3

fun main() {
    val response = "D2-D4;0"
    val pars = response.split("-", ";")

    println(pars[0])
    println(pars[1])
    println(pars[2])
}