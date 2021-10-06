package simduck

import simduck.feature.QuackBehavior

class Quack: QuackBehavior {
    override fun quack() {
        println("꽥꽥!")
    }
}