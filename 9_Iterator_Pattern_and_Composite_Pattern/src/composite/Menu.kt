package composite

class Menu(private val sName: String, private val sDescription: String) : MenuComponent() {
    val menuComponents: MutableList<MenuComponent> = mutableListOf()
    override fun add(menuComponent: MenuComponent) {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent) {
        menuComponent.remove(menuComponent)
    }

    override fun getChild(i: Int): MenuComponent = menuComponents[i]
    override fun getName(): String = sName
    override fun getDescription(): String = sDescription

    override fun createIterator(): Iterator<MenuComponent> {

        return CompositeIterator(menuComponents.iterator()) as Iterator<MenuComponent>
    }

    override fun print() {
        println("\n ${getName()}, ${getDescription()}")
        println("---------------------------")

        val iterator: Iterator<MenuComponent> = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }
}