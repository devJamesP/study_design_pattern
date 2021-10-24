package pizza.nykpizza

import pizza.*
import pizza.factory.PizzaIngredientFactory
import pizza.factory.PizzaStore

class NYPizzaStore : PizzaStore() {
    val ingredientFactory: PizzaIngredientFactory by lazy { NYPizzaIngredientFactory() }
    override fun createPizza(type: String): Pizza =
        when (type) {
            "cheese" -> NYStyleCheesePizza(ingredientFactory)
            "pepperoni" -> NYStylePepperoniPizza(ingredientFactory)
            "clam" -> NYStyleClamPizza(ingredientFactory)
            "veggie" -> NYStyleVeggiePizza(ingredientFactory)
            else -> NYStyleCheesePizza(ingredientFactory)
        }
}