package adapter.duck_turkey

import adapter.duck_turkey.duck.Duck
import adapter.duck_turkey.duck.MallardDuck
import adapter.duck_turkey.turkey.Turkey
import adapter.duck_turkey.turkey.TurkeyAdapter
import adapter.duck_turkey.turkey.WildTurkey

fun main() {
    val duck : Duck = MallardDuck()
    val turkey: Turkey = WildTurkey()

    val turkeyAdapter = TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble()
    turkey.fly()

    println("\nThe Duck says...")
    testDuck(duck)

    println("\nThe TurkeyAdapter says...")
    testDuck(turkeyAdapter)
}

fun testDuck(duck: Duck) {
    duck.quack()
    duck.fly()
}