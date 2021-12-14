package sim_ui_duck.call

import sim_ui_duck.duck.Quackable


class Observable(private val duck : QuackObservable) : QuackObservable {
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun notifyObserver() {
        val iterator = observers.iterator()
        while(iterator.hasNext()) {
            val observer = iterator.next()
            observer.update(duck)
        }
    }

    companion object {
        val observers = mutableListOf<Observer>()
    }
}