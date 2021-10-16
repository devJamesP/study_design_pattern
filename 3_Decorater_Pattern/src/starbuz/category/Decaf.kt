package starbuz.category

import starbuz.Beverage

class Decaf: Beverage() {
    override val description: String = "디카페인"
    override fun cost() : Double = 1.05
}