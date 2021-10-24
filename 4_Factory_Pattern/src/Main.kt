import pizza.Pizza
import pizza.factory.PizzaStore
import pizza.chicagopizza.ChicagoPizzaStore
import pizza.nykpizza.NYPizzaStore

fun main() {
    val nyStore: PizzaStore = NYPizzaStore()
    val chicagoStore: PizzaStore = ChicagoPizzaStore()

    var pizza : Pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza.name}\n")

    pizza = chicagoStore.orderPizza("cheese")
    println("Joel ordered a ${pizza.name}\n")
}