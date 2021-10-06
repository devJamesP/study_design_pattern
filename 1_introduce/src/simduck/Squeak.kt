package simduck

import simduck.feature.QuackBehavior

class Squeak : QuackBehavior {
    override fun quack() {
        println("삑삑!")
    }
}