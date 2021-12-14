package proxy.state

import state.GumballMachine

class SoldOutState(@Transient private val gumballMachine : GumballMachine ): State {
    override fun insertQuarter() {
        println("죄송합니다. 알맹이가 다 팔렸습니다.")
    }

    override fun ejectQuarter() {
        println("죄송합니다. 알맹이가 다 팔렸습니다.")
    }

    override fun turnCrank() {
        println("죄송합니다. 알맹이가 다 팔렸습니다.")
    }

    override fun dispense() {
        println("죄송합니다. 알맹이가 다 팔렸습니다.")
    }
}