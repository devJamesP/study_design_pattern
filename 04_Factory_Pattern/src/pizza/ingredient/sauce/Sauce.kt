package pizza.ingredient.sauce

import pizza.ingredient.Ingredient

abstract class Sauce: Ingredient() {
    abstract fun createSauce()
}