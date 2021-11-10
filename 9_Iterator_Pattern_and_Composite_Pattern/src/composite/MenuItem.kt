package composite

class MenuItem(
    private val sName: String,
    private val sDescription: String,
    private val bVegetarian: Boolean,
    private val dPrice: Double
): MenuComponent() {
    override fun getName(): String = sName
    override fun getDescription(): String = sDescription
    override fun getPrice(): Double = dPrice
    override fun isVegetarian() = bVegetarian

    override fun print() {
        print("  ${getName()}")
        if (isVegetarian()) print("(v)")
        println(", ${getPrice()}")
        println("    -- ${getDescription()}")
    }
}