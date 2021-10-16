package starbuz.category

import starbuz.Beverage

class HouseBlend: Beverage() {
    override val description: String = "하우스 블렌드 커피"
    override fun cost() : Double = 0.89
}