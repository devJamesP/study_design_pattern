package sim_ui_duck.manage

import sim_ui_duck.call.Observable
import sim_ui_duck.call.Observer
import sim_ui_duck.duck.Quackable

class Flock : Quackable {
    private val ducks = mutableListOf<Quackable>()

    fun add(quacker: Quackable) {
        ducks.add(quacker)
    }

    override fun quack() {
        val iterator = ducks.iterator()
        while(iterator.hasNext()) {
            val duck = iterator.next()
            duck.quack()
        }
    }

    private val observable : Observable = Observable(this)

    override fun registerObserver(observer: Observer) {
        val iterator = ducks.iterator()
        while(iterator.hasNext()) {
            val duck = iterator.next() as? Observer
            duck?.let { registerObserver(duck) }
        }
    }

    override fun notifyObserver() {
    }
}