package iterator.cafemenu

import iterator.MenuItem
import iterator.menu.Menu

class CafeMenu : Menu {
    private val menuItems: MutableMap<String, MenuItem> = mutableMapOf()
    init {
        menuItems.apply {
            addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자튀김이 첨가된 베지 버거", true, 3.99)
            addItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69)
            addItem("베리또", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 베리또", true, 4.29)
        }
    }
    private fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        menuItems[menuItem.name] = menuItem
    }

    override fun createIterator(): Iterator<MenuItem> {
        return menuItems.values.iterator()
    }
}