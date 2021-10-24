package pizza.chicagopizza

import pizza.*
import pizza.chicagopizza.ingredient.ChicagoPizzaIngredientFactory
import pizza.factory.PizzaStore

class ChicagoPizzaStore : PizzaStore() {
    private val chicagoPizzaIngredientFactory: ChicagoPizzaIngredientFactory by lazy {
        ChicagoPizzaIngredientFactory()
    }
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory)
            "pepperoni" -> ChicagoStylePepperoniPizza(chicagoPizzaIngredientFactory)
            "clam" -> ChicagoStyleClamPizza(chicagoPizzaIngredientFactory)
            "veggie" -> ChicagoStyleVeggiePizza(chicagoPizzaIngredientFactory)
            else -> ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory)
        }
    
}