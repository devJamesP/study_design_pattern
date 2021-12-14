package sim_ui_duck.goose

import sim_ui_duck.call.Observable
import sim_ui_duck.call.Observer
import sim_ui_duck.duck.Quackable

class GooseAdapter(private val goose: Goose) : Quackable {
    private val observable : Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        observable.registerObserver(observer)
    }

    override fun notifyObserver() {
        observable.notifyObserver()
    }

    override fun quack() {
        goose.honk()
        notifyObserver()
    }
}