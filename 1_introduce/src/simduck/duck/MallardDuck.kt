package simduck.duck

import simduck.behavior.*

class MallardDuck : Duck() {
    override var flyBehavior: FlyBehavior = FlyNoWay()
    override var quackBehavior: QuackBehavior = MuteQuack()

    override fun display() {
        println("나는 청동오리이다!")
    }

}