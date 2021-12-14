package sim_ui_duck

import sim_ui_duck.call.Quackologist
import sim_ui_duck.call.Quackologist2
import sim_ui_duck.create.AbstractDuckFactory
import sim_ui_duck.create.CountingDuckFactory
import sim_ui_duck.duck.*
import sim_ui_duck.goose.GooseAdapter
import sim_ui_duck.goose.Goose
import sim_ui_duck.manage.Flock
import sim_ui_duck.scholar.QuackCounter

class DuckSimulator {
    fun simulate(duckFactory : AbstractDuckFactory) {
        val redheadDuck : Quackable = duckFactory.createRedheadDuck()
        val duckCall : Quackable = duckFactory.createDuckCall()
        val rubberDuck : Quackable = duckFactory.createRubberDuck()
        val gooseDuck : Quackable = duckFactory.createGooseDuck()
        println("\nDuck Simulator : With Composite - Flocks")

        // 오리떼
        val flockOfDucks = Flock()
        flockOfDucks.add(redheadDuck)
        flockOfDucks.add(duckCall)
        flockOfDucks.add(rubberDuck)
        flockOfDucks.add(gooseDuck)

        // 물오리떼를 관리하는 Flock
        val flockOfMallards = Flock()
        val mallardDuck1 : Quackable = duckFactory.createMallardDuck()
        val mallardDuck2 : Quackable = duckFactory.createMallardDuck()
        val mallardDuck3 : Quackable = duckFactory.createMallardDuck()
        val mallardDuck4 : Quackable = duckFactory.createMallardDuck()

        flockOfMallards.add(mallardDuck1)
        flockOfMallards.add(mallardDuck2)
        flockOfMallards.add(mallardDuck3)
        flockOfMallards.add(mallardDuck4)

        flockOfDucks.add(flockOfMallards) // 물오리떼를 오리떼에 추가

        println("\nDuck Simulator: Whole Flock Simulation")
        simulate(flockOfDucks)

        println("\nDuck Simulator: Mallard Flock Simulation")
        simulate(flockOfMallards)



        println("The ducks quacked ${QuackCounter.numberOfQuacks } times")
    }
    fun simulate2(duckFactory : AbstractDuckFactory) {
        val redheadDuck : Quackable = duckFactory.createRedheadDuck()
        val duckCall : Quackable = duckFactory.createDuckCall()
        val rubberDuck : Quackable = duckFactory.createRubberDuck()
        val gooseDuck : Quackable = duckFactory.createGooseDuck()
        println("\nDuck Simulator : With Composite - Flocks")

        // 오리떼
        val flockOfDucks = Flock()
        flockOfDucks.add(redheadDuck)
        flockOfDucks.add(duckCall)
        flockOfDucks.add(rubberDuck)
        flockOfDucks.add(gooseDuck)

        // 물오리떼를 관리하는 Flock
        val flockOfMallards = Flock()
        val mallardDuck1 : Quackable = duckFactory.createMallardDuck()
        val mallardDuck2 : Quackable = duckFactory.createMallardDuck()
        val mallardDuck3 : Quackable = duckFactory.createMallardDuck()
        val mallardDuck4 : Quackable = duckFactory.createMallardDuck()

        flockOfMallards.add(mallardDuck1)
        flockOfMallards.add(mallardDuck2)
        flockOfMallards.add(mallardDuck3)
        flockOfMallards.add(mallardDuck4)

        flockOfDucks.add(flockOfMallards) // 물오리떼를 오리떼에 추가

        println("\nDuck Simulator : With Observer")
        val quackologist = Quackologist()
        val quackologist2 = Quackologist2()
        flockOfDucks.registerObserver(quackologist)
        flockOfDucks.registerObserver(quackologist2)

        simulate(flockOfDucks)

        println("\nThe ducks quacked ${QuackCounter.numberOfQuacks} times")
    }
    private fun simulate(duck: Quackable) { duck.quack() }
}

/*
fun main() {
    val duckSimulator = DuckSimulator()
    val duckFactory : AbstractDuckFactory = CountingDuckFactory()

    duckSimulator.simulate2(duckFactory)

}*/
