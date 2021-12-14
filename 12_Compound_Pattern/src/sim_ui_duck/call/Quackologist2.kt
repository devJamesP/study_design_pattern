package sim_ui_duck.call

class Quackologist2 : Observer {
    override fun update(duck: QuackObservable) {
        println("Quackologist2 : $duck test QuQU!!!")
    }
}