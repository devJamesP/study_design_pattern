package pizza.ingredient.veggies.detailveggies

import pizza.ingredient.veggies.Veggies

class RedPepper: Veggies() {
    override fun createVeggies() {
        println("매콤한 고추 추가!")
    }
}