package sim_ui_duck.call



interface QuackObservable {
    fun registerObserver(observer: Observer)
    fun notifyObserver()
}