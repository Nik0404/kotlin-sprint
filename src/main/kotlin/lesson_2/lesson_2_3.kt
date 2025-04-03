package lesson_2
//pull requests
fun main() {
    var hour = 9
    var minutes = 39
    val fullTime = 457

    var sHour = fullTime / 60
    var sMin = fullTime - sHour * 60

    hour += sHour
    minutes += sMin

    val newMin = hour * 60 + minutes
    sHour = newMin / 60
    sMin = newMin - sHour * 60

    println("$sHour:$sMin")
}