package simduck.behavior

import simduck.behavior.QuackBehavior

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<< 조용~ >>")
    }
}