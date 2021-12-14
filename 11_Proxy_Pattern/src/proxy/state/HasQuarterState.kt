package proxy.state

import state.GumballMachine
import kotlin.random.Random

class HasQuarterState(@Transient private val gumballMachine: GumballMachine): State {
    private val randomWinner = Random(System.currentTimeMillis())
    override fun insertQuarter() {
        println("동전은 한 개만 넣어주세요.")
    }

    override fun ejectQuarter() {
        println("동전을 반환합니다.")
        gumballMachine.setState(gumballMachine.noQuarterState)
    }

    override fun turnCrank() {
         println("손잡이를 돌리셨습니다.")
        val winner = randomWinner.nextInt(10)
        if (winner == 0 && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.winnerState)
        } else {
            gumballMachine.setState(gumballMachine.soldState)
        }

    }

    override fun dispense() {
        println("알맹이가 나갈 수 없습니다. 손잡이를 돌려주세요.")
    }
}