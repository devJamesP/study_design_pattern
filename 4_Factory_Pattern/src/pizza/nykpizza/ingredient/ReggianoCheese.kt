package pizza.nykpizza.ingredient

import pizza.ingredient.cheese.Cheese

class ReggianoCheese: Cheese() {
    override fun createCheese() {
        println("살살 녹는 치즈")
    }
}