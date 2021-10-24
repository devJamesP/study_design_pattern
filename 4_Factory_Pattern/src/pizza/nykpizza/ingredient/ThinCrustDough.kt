package pizza.nykpizza.ingredient

import pizza.ingredient.dough.Dough

class ThinCrustDough: Dough() {
    override fun createDough() {
        println("얇은 도우")
    }
}