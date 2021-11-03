package adapter.duck_turkey.turkey

import adapter.duck_turkey.duck.Duck

class TurkeyAdapter(private val turkey: Turkey): Duck {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        turkey.fly()
        turkey.fly()
        turkey.fly()
        turkey.fly()
        turkey.fly()

    }
}