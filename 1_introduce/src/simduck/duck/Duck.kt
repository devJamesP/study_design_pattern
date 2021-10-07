package simduck.duck

import simduck.behavior.FlyBehavior
import simduck.behavior.FlyWithWings
import simduck.behavior.Quack
import simduck.behavior.QuackBehavior

abstract class Duck {
    abstract fun display()

    open fun swim() { println("모든 오리는 물에 뜬다. 가짜 오리도 뜬다!!") }

    open var flyBehavior : FlyBehavior = FlyWithWings()
    open var quackBehavior: QuackBehavior = Quack()

    fun performQuack() { quackBehavior.quack() }
    fun performFly() { flyBehavior.fly() }
}
/** [TMI]
 *  여러 행동을 하고 싶을 떄 Duck에서는 quackBehavior에 의해 참조되는 객체에서
 *  그 행동을 하기만 하면 된다.
 *  객체의 종류는 신경쓰지 않고, quack()을 실행시키는 것이 중요해 지는 것이다.
 */