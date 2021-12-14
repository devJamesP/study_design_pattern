package sim_ui_duck.scholar

import sim_ui_duck.call.Observable
import sim_ui_duck.call.Observer
import sim_ui_duck.duck.Quackable

class QuackCounter(private val duck: Quackable): Quackable {
    private val observable : Observable = Observable(this)
    override fun quack() {
        duck.quack()
        ++_numberOfQuacks
    }

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObserver() {
        observable.notifyObserver()
    }

    companion object {
        private var _numberOfQuacks = 0
        val numberOfQuacks get() = _numberOfQuacks
    }
}