package simduck

import simduck.feature.QuackBehavior

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("묵음")
    }
}