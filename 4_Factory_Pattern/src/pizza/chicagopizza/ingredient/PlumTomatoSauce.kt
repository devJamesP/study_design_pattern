package pizza.chicagopizza.ingredient

import pizza.ingredient.sauce.Sauce

class PlumTomatoSauce : Sauce() {
    override fun createSauce() {
        println("달콤한 플럼 토마토 소스")
    }
}