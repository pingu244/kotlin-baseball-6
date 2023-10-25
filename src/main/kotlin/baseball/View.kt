package baseball

import baseball.model.Result

class View {

    fun printStartMessage() = println("숫자 야구 게임을 시작합니다.")

    fun inputUserNumber(): List<Int> {
        print("숫자를 입력해주세요 : ")
        val input = readln()
        // todo 모두 숫자인지 여부 예외처리
        return input.map { it.toString().toInt() }
    }

    fun printResult(result: Result) {
        var output = ""
        if (result.ball > 0) {
            output += "${result.ball}볼 "
        }
        if (result.strike > 0) {
            output += "${result.strike}스트라이크"
        }
        if (result.strike == 0 && result.ball == 0) {
            output = "낫싱"
        }
        println(output)
    }

    fun printCorrectMessage() = println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")

    fun questPlayingGame(): Boolean {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return when (readln()) {
            "1" -> true
            "2" -> false
            else -> throw IllegalArgumentException()
        }
    }
}
