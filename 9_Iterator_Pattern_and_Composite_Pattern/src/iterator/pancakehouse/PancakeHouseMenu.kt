package iterator.pancakehouse

import iterator.MenuItem
import iterator.menu.Menu

class PancakeHouseMenu : Menu {
    private val menuItems: MutableList<MenuItem> by lazy { mutableListOf() }
    init {
        addItem("K&B 팬케이크 세트", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 2.99)
        addItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 곁들여진 팬케이크", false, 2.99)
        addItem("블루베리 팬케이크", "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크", true, 3.49)
        addItem("와플", "스크램블 에그와 토스트가 곁들여진 팬케이크", true, 3.59)
    }

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems.add(menuItem)
    }

    override fun createIterator(): Iterator<MenuItem> = menuItems.iterator()
}