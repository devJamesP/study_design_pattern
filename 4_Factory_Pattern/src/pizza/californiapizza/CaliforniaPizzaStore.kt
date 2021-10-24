package pizza.californiapizza

import pizza.*
import pizza.factory.PizzaStore

class CaliforniaPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza = when (type) {
        "cheese" -> CaliforniaCheesePizza()
        "pepperoni" -> CaliforniaPepperoniPizza()
        "clam" -> CaliforniaClamPizza()
        "veggie" -> CaliforniaVeggiePizza()
        else -> CaliforniaCheesePizza()
    }
}