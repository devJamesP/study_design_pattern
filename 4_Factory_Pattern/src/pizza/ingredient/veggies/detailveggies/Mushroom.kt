package pizza.ingredient.veggies.detailveggies

import pizza.ingredient.veggies.Veggies

class Mushroom: Veggies() {
    override fun createVeggies() {
        println("살짝 구운 버섯 추가!")
    }
}