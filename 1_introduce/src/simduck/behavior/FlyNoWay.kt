package simduck.behavior

import simduck.behavior.FlyBehavior

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("저는 못 날아요.")
    }
}