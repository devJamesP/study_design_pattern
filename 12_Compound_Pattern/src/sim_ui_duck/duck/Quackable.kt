package sim_ui_duck.duck

import sim_ui_duck.call.QuackObservable

interface Quackable : QuackObservable{
    fun quack()
}