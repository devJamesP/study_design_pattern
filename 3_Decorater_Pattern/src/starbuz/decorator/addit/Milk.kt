package starbuz.decorator.addit

import starbuz.Beverage
import starbuz.decorator.CondimentDecorator

class Milk(
    private val beverage: Beverage
): CondimentDecorator() {
    override val description: String = "${beverage.description}, 스팀 밀크"
    override fun cost(): Double = .10 + beverage.cost()
}