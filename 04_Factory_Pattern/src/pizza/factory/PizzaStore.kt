package pizza.factory

import pizza.Pizza

abstract class PizzaStore{
    fun orderPizza(type: String): Pizza {
        val pizza: Pizza = createPizza(type)
        return pizza.apply {
            prepare()
            bake()
            cut()
            box()
        }
    }
   protected abstract fun createPizza(type: String): Pizza
}