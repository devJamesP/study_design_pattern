package pizza.chicagopizza.ingredient

import pizza.factory.PizzaIngredientFactory
import pizza.ingredient.cheese.Cheese
import pizza.ingredient.clam.Clams
import pizza.ingredient.dough.Dough
import pizza.ingredient.pepperoni.Pepperoni
import pizza.ingredient.sauce.Sauce
import pizza.ingredient.veggies.Veggies
import pizza.nykpizza.ingredient.SlicedPepperoni
import pizza.ingredient.veggies.detailveggies.Garlic
import pizza.ingredient.veggies.detailveggies.Mushroom
import pizza.ingredient.veggies.detailveggies.Onion
import pizza.ingredient.veggies.detailveggies.RedPepper

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun selectDough(): Dough {
        return ThickCrustDough()
    }

    override fun selectSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
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
        return FrozenClams()
    }
}