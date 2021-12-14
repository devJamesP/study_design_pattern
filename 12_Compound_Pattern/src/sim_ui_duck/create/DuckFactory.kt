package sim_ui_duck.create

import sim_ui_duck.duck.*
import sim_ui_duck.goose.Goose
import sim_ui_duck.goose.GooseAdapter

class DuckFactory: AbstractDuckFactory() {
    override fun createMallardDuck(): Quackable {
        return MallardDuck()
    }

    override fun createRedheadDuck(): Quackable {
        return RedheadDuck()

    }

    override fun createDuckCall(): Quackable {
        return DuckCall()

    }

    override fun createRubberDuck(): Quackable {
        return RubberDuck()

    }

    override fun createGooseDuck(): Quackable {
        return GooseDuckFactory().createGooseDuck()
    }
}