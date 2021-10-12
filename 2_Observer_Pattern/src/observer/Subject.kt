package observer

interface Subject {
    fun registerObserver()
    fun removeObserver()
    fun notifyObservers()
}