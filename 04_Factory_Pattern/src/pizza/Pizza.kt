package pizza

import pizza.ingredient.Ingredient
import pizza.ingredient.clam.Clams
import pizza.ingredient.dough.Dough
import pizza.ingredient.pepperoni.Pepperoni
import pizza.ingredient.sauce.Sauce
import pizza.ingredient.veggies.Veggies
import pizza.nykpizza.ingredient.SlicedPepperoni

abstract class Pizza {
    open var name = ""
    open lateinit var dough : Dough
    open lateinit var sauce : Sauce
    open lateinit var veggies: List<Veggies>
    open lateinit var clams: Clams
    open lateinit var pepperoni: Pepperoni

    abstract fun prepare()

    open fun bake() {
        println("Bake for 25 minutes at 350")
    }

    open fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("Place pizza in official PizzaStore box")
    }

    protected val toppings: MutableList<String> = mutableListOf()
}