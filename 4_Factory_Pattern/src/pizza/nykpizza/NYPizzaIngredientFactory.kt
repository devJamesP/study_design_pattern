package pizza.nykpizza

import pizza.factory.PizzaIngredientFactory
import pizza.ingredient.cheese.Cheese
import pizza.ingredient.clam.Clams
import pizza.ingredient.dough.Dough
import pizza.ingredient.pepperoni.Pepperoni
import pizza.ingredient.sauce.Sauce
import pizza.ingredient.veggies.Veggies
import pizza.nykpizza.ingredient.*
import pizza.ingredient.veggies.detailveggies.Garlic
import pizza.ingredient.veggies.detailveggies.Mushroom
import pizza.ingredient.veggies.detailveggies.Onion
import pizza.ingredient.veggies.detailveggies.RedPepper

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun selectDough(): Dough {
        return ThinCrustDough()
    }

    override fun selectSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun selectVeggies(): List<Veggies> {
        val veggies: List<Veggies> = listOf(
            Garlic(), Mushroom(), Onion(), RedPepper()
        )
        return veggies
    }

    override fun selectPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun selectClam(): Clams {
        return FreshClams()
    }
}