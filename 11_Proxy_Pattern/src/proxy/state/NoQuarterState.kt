package proxy.state

import state.GumballMachine

class NoQuarterState(@Transient private val gumballMachine: GumballMachine): State {
    override fun insertQuarter() {
        println("동전을 넣으셨습니다.")
        gumballMachine.setState(gumballMachine.hasQuarterState)
    }

    override fun ejectQuarter() {
        println("동전을 넣어주세요.")
    }

    override fun turnCrank() {
        println("동전을 넣어주세요.")
    }

    override fun dispense() {
        println("동전을 넣어주세요.")
    }
}