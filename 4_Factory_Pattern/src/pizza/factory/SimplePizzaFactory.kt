package pizza.factory

import pizza.*

class SimplePizzaFactory {
    private var _pizza: Pizza? = null
    val pizza: Pizza? get() = _pizza
    fun createPizza(type: String): Pizza? {
//        _pizza = when (type) {
//            "cheese" -> CheesePizza()
//            "greek" -> GreekPizza()
//            "pepperoni" -> PepperoniPizza()
//            "clam" -> ClamPizza()
//            "veggie" -> EggiePizza()
//            else -> throw error("해당 피자는 매진되었습니다 :)")
//        }
//        return pizza!!
        return null
    }
}