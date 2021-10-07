import simduck.behavior.FlyRocketPowered
import simduck.duck.Duck
import simduck.duck.MallardDuck
import simduck.duck.RedheadDuck

fun main() {
    val duck: Duck = MallardDuck()
    duck.display()
    duck.swim()
    duck.performFly()

    duck.flyBehavior = FlyRocketPowered()
    duck.performFly()
}