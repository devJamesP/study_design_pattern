package simduck

import simduck.feature.FlyBehavior

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("나는 날 수 없다.")
    }
}