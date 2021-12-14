package sim_ui_duck.create

import sim_ui_duck.duck.Quackable

abstract class AbstractGooseFactory {
    abstract fun createGooseDuck() : Quackable
}