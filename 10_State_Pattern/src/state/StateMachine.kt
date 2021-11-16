package state

class StateMachine {
    private var state = SOLD_OUT
    fun insertQuarter() {
        when(state) {
            HAS_QUARTER -> println("동전은 한 개만 넣어주세요.")
            SOLD_OUT -> println("매진되었습니다. 다음 기회에 이용해주세요.")
            SOLD -> println("잠깐만 기다려 주세요. 알맹이가 배출되고 있습니다.")
            NO_QUARTER -> { println("동전이 투입되었습니다."); state = HAS_QUARTER }
        }
    }



    companion object {
        const val SOLD_OUT = 0
        const val NO_QUARTER = 1
        const val HAS_QUARTER = 2
        const val SOLD = 3
    }
}