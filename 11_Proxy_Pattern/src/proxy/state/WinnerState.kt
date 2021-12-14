package proxy.state

import state.GumballMachine

class WinnerState(@Transient private val gumballMachine: GumballMachine) : State {
    override fun insertQuarter() {
        println("잠깐만 기다려 주세요. 알맹이가 나가고 있습니다.")
    }

    override fun ejectQuarter() {
        println("이미 알맹이를 뽑으셨습니다.")
    }

    override fun turnCrank() {
        println("손잡이를 한 번만 돌려주세요.")
    }

    override fun dispense() {
        println("축하드립니다! 알맹이를 하나 더 받으실 수 있습니다.")
        gumballMachine.releaseBall()
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.soldOutState)
        } else {
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.noQuarterState)
            } else {
                println("더 이상 알맹이가 없습니다.")
                gumballMachine.setState(gumballMachine.soldOutState)
            }
        }

    }
}