package pizza.nykpizza.ingredient

import pizza.ingredient.clam.Clams

class FreshClams: Clams() {
    override fun createClam() {
        println("미네랄이 높고 신선한 조개!")
    }
}