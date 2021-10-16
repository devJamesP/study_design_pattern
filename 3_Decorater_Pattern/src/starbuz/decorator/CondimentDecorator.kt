package starbuz.decorator

import starbuz.Beverage

abstract class CondimentDecorator: Beverage() {
    abstract override val description: String
}