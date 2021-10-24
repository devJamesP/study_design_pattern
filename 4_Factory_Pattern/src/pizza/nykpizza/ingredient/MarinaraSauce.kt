package pizza.nykpizza.ingredient

import pizza.ingredient.sauce.Sauce

class MarinaraSauce: Sauce() {
    override fun createSauce() {
        println("정통 마리나라 소스!")
    }
}