package starbuz.decorator.addit

import starbuz.Beverage
import starbuz.decorator.CondimentDecorator

class Soy(
    private val beverage: Beverage
): CondimentDecorator() {
    override val description: String = "${beverage.description}, 두유"
    override fun cost(): Double =
        when (size) {
            Beverage.TALL -> .1 + beverage.cost()
            Beverage.GRANDE -> .15 + beverage.cost()
            Beverage.VENTI -> .2 + beverage.cost()
            else -> .1 + beverage.cost()
        }

    override var size: Double = beverage.size

}