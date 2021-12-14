package sim_ui_duck.call

class Quackologist : Observer {
    override fun update(duck: QuackObservable) {
        println("Quackologist : $duck just quacked.")
    }
}