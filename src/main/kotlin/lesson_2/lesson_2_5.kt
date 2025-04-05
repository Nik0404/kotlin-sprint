package lesson_2

fun main() {
    val contributionYear = 20.0
    val summ = 70000
    val bet = 0.167

    val overBet = summ * Math.pow(1 + bet, contributionYear)
    val formatToResult = String.format("%.3f", overBet)

    println(formatToResult)
}