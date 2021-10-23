package pizza.ingredient.cheese

import pizza.ingredient.Ingredient

abstract class Cheese : Ingredient() {
    abstract fun createCheese()
}