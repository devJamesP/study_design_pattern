package pizza.nykpizza

import pizza.Pizza
import pizza.factory.PizzaIngredientFactory
import pizza.ingredient.clam.Clams
import pizza.ingredient.dough.Dough
import pizza.ingredient.pepperoni.Pepperoni
import pizza.ingredient.sauce.Sauce
import pizza.ingredient.veggies.Veggies

class NYStyleCheesePizza(nyPizzaIngredientFactory: PizzaIngredientFactory) : Pizza() {
    override var name = "NY Style Sauce and Cheesee Pizza"
    override var dough: Dough = nyPizzaIngredientFactory.selectDough()
    override var sauce: Sauce = nyPizzaIngredientFactory.selectSauce()
    override var veggies: List<Veggies> = nyPizzaIngredientFactory.selectVeggies()
    override var clams: Clams = nyPizzaIngredientFactory.selectClam()
    override var pepperoni: Pepperoni = nyPizzaIngredientFactory.selectPepperoni()

    init {
        toppings.clear()
        toppings.add("Grated Reggiano Cheese")
        toppings.add("add tomato sauce!! double")
    }

    override fun prepare() {
        println(
            "피자를 준비합니다....\n" +
                    "피자 이름은 $name 입니다.\n" +
                    "pizza info!!"
        )
        dough.createDough()
        sauce.createSauce()
        veggies.forEach { it.createVeggies() }
        clams.createClam()
        pepperoni.createPepperoni()
        toppings.joinToString(separator = "")
    }
}
