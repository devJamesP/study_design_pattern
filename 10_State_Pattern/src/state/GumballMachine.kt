package state

import state.StateMachine.Companion.NO_QUARTER

class GumballMachine(private var _count: Int) {
    val soldOutState: State = SoldOutState(this)
    val noQuarterState: State = NoQuarterState(this) 
    val hasQuarterState: State = HasQuarterState(this)
    val soldState: State = SoldState(this)
    val winnerState: State = WinnerState(this)
    
    private var state: State = soldOutState
    val count get() = _count
    
    init {
        if (count > 0) state = noQuarterState
    }

    override fun toString(): String {
        return if (count > 0) {
         "\n주식회사 왕뽑기\n자바로 돌아가는 2004년형 뽑기 기계\n남은 개수: ${count}개\n동전 투입 대기 중\n"
        } else {
            "\n주식회사 왕뽑기\n자바로 돌아가는 2004년형 뽑기 기계\n남은 개수: ${count}개\n매진\n"
        }
    }


    // 동전 투입에 대한 행동
    fun insertQuarter() {
        state.insertQuarter()
    }

    // 동전을 반환받는 행동
    fun ejectQuarter() {
        state.ejectQuarter()
    }

    // 손잡이를 돌리는 행동
    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun setState(state: State) {
        this.state = state
    }
    
    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count != 0) {
            _count -= 1
        }
    }

    fun refill(count: Int) {
        if (count <= 0) return
        println("알맹이를 충전합니다.")
        _count = count
        state = noQuarterState
    }
    
    
    companion object {
        private const val SOLD_OUT = 0
        private const val NO_QUARTER = 1
        private const val HAS_QUARTER = 2
        private const val SOLD = 3
    }
}