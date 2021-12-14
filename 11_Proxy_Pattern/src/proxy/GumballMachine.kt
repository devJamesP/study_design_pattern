package state

import proxy.GumballMachineRemote
import proxy.state.*
import java.rmi.server.UnicastRemoteObject

class GumballMachine (private var _count: Int, private val _location: String) : UnicastRemoteObject(), GumballMachineRemote {
    val soldOutState: State = SoldOutState(this)
    val noQuarterState: State = NoQuarterState(this)
    val hasQuarterState: State = HasQuarterState(this)
    val soldState: State = SoldState(this)
    val winnerState: State = WinnerState(this)
    
    private var _state: State = soldOutState
    override fun getCount(): Int = _count
    override fun getLocation(): String = _location
    override fun getState(): State = _state

    init {
        if (getCount() > 0) _state = noQuarterState
    }

    override fun toString(): String {
        return if (_count > 0) {
         "\n주식회사 왕뽑기\n자바로 돌아가는 2004년형 뽑기 기계\n남은 개수: ${_count}개\n동전 투입 대기 중\n"
        } else {
            "\n주식회사 왕뽑기\n자바로 돌아가는 2004년형 뽑기 기계\n남은 개수: ${_count}개\n매진\n"
        }
    }


    // 동전 투입에 대한 행동
    fun insertQuarter() {
        _state.insertQuarter()
    }

    // 동전을 반환받는 행동
    fun ejectQuarter() {
        _state.ejectQuarter()
    }

    // 손잡이를 돌리는 행동
    fun turnCrank() {
        _state.turnCrank()
        _state.dispense()
    }

    fun setState(state: State) {
        this._state = state
    }
    
    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (_count != 0) {
            _count -= 1
        }
    }

    fun refill(count: Int) {
        if (count <= 0) return
        println("알맹이를 충전합니다.")
        _count = count
        _state = noQuarterState
    }



    
    
    companion object {
        private const val SOLD_OUT = 0
        private const val NO_QUARTER = 1
        private const val HAS_QUARTER = 2
        private const val SOLD = 3
    }
}