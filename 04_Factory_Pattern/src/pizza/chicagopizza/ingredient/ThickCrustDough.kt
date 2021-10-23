package pizza.chicagopizza.ingredient

import pizza.ingredient.dough.Dough

class ThickCrustDough : Dough() {
    override fun createDough() {
        println("두껍고 촉촉한 도우")
    }
}

