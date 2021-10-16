package starbuz.decorator.addit

import starbuz.Beverage
import starbuz.decorator.CondimentDecorator

class Mocha(private val beverage: Beverage): CondimentDecorator() {
    override val description: String = "${beverage.description}, 모카"
    override fun cost(): Double =
        when (size) {
            Beverage.TALL -> .2 + beverage.cost()
            Beverage.GRANDE -> .25 + beverage.cost()
            Beverage.VENTI -> .3 + beverage.cost()
            else -> .2 + beverage.cost()
        }

    override var size: Double = beverage.size
}