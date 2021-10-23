package pizza.nykpizza.ingredient

import pizza.ingredient.pepperoni.Pepperoni

class SlicedPepperoni: Pepperoni() {
    override fun createPepperoni() {
        println("짭잘하고 매콤한 페퍼로니 소시지!")
    }
}