package sim_ui_duck.call

interface Observer {
    fun update(duck : QuackObservable)
}