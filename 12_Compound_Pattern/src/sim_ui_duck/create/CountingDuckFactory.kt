package sim_ui_duck.create

import sim_ui_duck.duck.*
import sim_ui_duck.goose.Goose
import sim_ui_duck.goose.GooseAdapter
import sim_ui_duck.scholar.QuackCounter

class CountingDuckFactory : AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable {
        return QuackCounter(MallardDuck())
    }

    override fun createRedheadDuck(): Quackable {
        return QuackCounter(RedheadDuck())

    }

    override fun createDuckCall(): Quackable {
        return QuackCounter(DuckCall())
    }

    override fun createRubberDuck(): Quackable {
        return QuackCounter(RubberDuck())

    }

    override fun createGooseDuck(): Quackable {
        return QuackCounter(GooseDuckFactory().createGooseDuck())
    }
}