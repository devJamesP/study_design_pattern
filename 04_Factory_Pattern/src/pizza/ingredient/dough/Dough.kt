package pizza.ingredient.dough

import pizza.ingredient.Ingredient

abstract class Dough: Ingredient() {
    abstract fun createDough()
}