package starbuz

abstract class Beverage {
    open val description: String = "제목 없음"
    // 사이즈
    open var size: Double = .0
    // 음료수 기본가
    abstract fun cost(): Double

    companion object {
        const val TALL = 1.0
        const val GRANDE = 1.5
        const val VENTI = 2.0
    }
}