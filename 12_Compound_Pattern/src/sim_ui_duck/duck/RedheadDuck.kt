package sim_ui_duck.duck

import sim_ui_duck.call.Observable
import sim_ui_duck.call.Observer

class RedheadDuck : Quackable {
    private val observable : Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObserver() {
        observable.notifyObserver()
    }

    override fun quack() {
        println("Quack!")
        notifyObserver()
    }
}