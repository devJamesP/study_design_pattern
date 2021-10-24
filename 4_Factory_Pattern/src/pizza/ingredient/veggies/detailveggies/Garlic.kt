package pizza.ingredient.veggies.detailveggies

import pizza.ingredient.veggies.Veggies

class Garlic: Veggies() {
    override fun createVeggies() {
        println("갈릭소스 추가!")
    }
}