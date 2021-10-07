package simduck.duck

import simduck.behavior.*

class MallardDuck : Duck() {
    override var flyBehavior: FlyBehavior = super.flyBehavior
    override var quackBehavior: QuackBehavior = super.quackBehavior

    override fun display() {
        println("나는 청동오리이다!")
    }

}