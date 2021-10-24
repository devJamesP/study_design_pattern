package pizza.chicagopizza

import pizza.Pizza
import pizza.chicagopizza.ingredient.ChicagoPizzaIngredientFactory
import pizza.ingredient.clam.Clams
import pizza.ingredient.dough.Dough
import pizza.ingredient.pepperoni.Pepperoni
import pizza.ingredient.sauce.Sauce
import pizza.ingredient.veggies.Veggies

class ChicagoStyleCheesePizza(chicagoPizzaIngredientFactory: ChicagoPizzaIngredientFactory) : Pizza() {
    override var name: String = "Chicago Style Sauce and Cheesee Pizza"
    override var dough: Dough = chicagoPizzaIngredientFactory.selectDough()
    override var sauce: Sauce = chicagoPizzaIngredientFactory.selectSauce()
    override var veggies: List<Veggies> = chicagoPizzaIngredientFactory.selectVeggies()
    override var clams: Clams = chicagoPizzaIngredientFactory.selectClam()
    override var pepperoni: Pepperoni = chicagoPizzaIngredientFactory.selectPepperoni()

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
