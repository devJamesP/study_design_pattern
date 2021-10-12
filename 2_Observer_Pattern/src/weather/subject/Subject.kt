package weather.subject

import weather.observer.Observer

interface Subject {
    fun registerObserver(observeObj: Observer)
    fun removeObserver(observeObj: Observer)
    fun notifyObserver()
}