package sim_ui_duck.create

import sim_ui_duck.duck.Quackable

abstract class AbstractDuckFactory {
    abstract fun createMallardDuck() : Quackable
    abstract fun createRedheadDuck() : Quackable
    abstract fun createDuckCall() : Quackable
    abstract fun createRubberDuck() : Quackable
    abstract fun createGooseDuck() : Quackable
}