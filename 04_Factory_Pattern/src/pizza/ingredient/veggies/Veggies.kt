package pizza.ingredient.veggies

import pizza.ingredient.Ingredient

abstract class Veggies : Ingredient() {
    abstract fun createVeggies()
}