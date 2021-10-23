package pizza.ingredient.veggies.detailveggies

import pizza.ingredient.veggies.Veggies

class Onion: Veggies() {
    override fun createVeggies() {
        println("양파 분말 추가!")
    }
}