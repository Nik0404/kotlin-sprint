package lesson_2

const val ONE = 1

fun main() {
    val contributionYear = 20.0
    val summ = 70000
    val bet = 0.167

    val overBet = summ * Math.pow(ONE + bet, contributionYear)
    val formatToResult = String.format("%.3f", overBet)

    println(formatToResult)
}