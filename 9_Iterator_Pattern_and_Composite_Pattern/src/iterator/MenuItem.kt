package iterator

class MenuItem(
    private val _name: String = "",
    private val _description: String = "",
    private val _vegetarian: Boolean = false,
    private val _price: Double = 0.0
) {
    val name: String get() = _name
    val description: String get() = _description
    val vegetarian: Boolean get() = _vegetarian
    val price: Double get() = _price

    override fun toString(): String {
        return "name : $name, description: $description, vegetarian: $vegetarian, price: $price"
    }
}