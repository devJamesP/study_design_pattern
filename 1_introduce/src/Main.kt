import simduck.MallardDuck
import simduck.RedheadDuck

fun main() {
    val redheadDuck = RedheadDuck()
    val mallardDuck = MallardDuck()

    with(redheadDuck) {
        quack()
        swim()
        display()
    }

    with(mallardDuck) {
        quack()
        swim()
        display()
    }
}