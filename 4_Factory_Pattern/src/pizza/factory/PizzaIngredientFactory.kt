package pizza.factory

import pizza.ingredient.cheese.Cheese
import pizza.ingredient.clam.Clams
import pizza.ingredient.dough.Dough
import pizza.ingredient.pepperoni.Pepperoni
import pizza.ingredient.sauce.Sauce
import pizza.ingredient.veggies.Veggies

interface PizzaIngredientFactory {
    fun selectDough(): Dough
    fun selectSauce(): Sauce
    fun createCheese(): Cheese
    fun selectVeggies(): List<Veggies>
    fun selectPepperoni(): Pepperoni
    fun selectClam(): Clams
}