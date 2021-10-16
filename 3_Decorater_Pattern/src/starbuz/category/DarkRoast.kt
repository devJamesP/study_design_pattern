package starbuz.category

import starbuz.Beverage

class DarkRoast: Beverage() {
    override val description: String = "다크로스트"
    override fun cost() : Double = 0.99
}