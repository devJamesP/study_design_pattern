package pizza.chicagopizza.ingredient

import pizza.ingredient.cheese.Cheese

class MozzarellaCheese : Cheese() {
    override fun createCheese() {
        println("쭉쭉 찢어지는 모짜렐라 치즈")
    }
}