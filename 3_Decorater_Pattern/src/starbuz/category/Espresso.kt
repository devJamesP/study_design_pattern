package starbuz.category

import starbuz.Beverage

class Espresso: Beverage() {
    override val description: String = "에스프레소"
    override fun cost() : Double = 1.99
}