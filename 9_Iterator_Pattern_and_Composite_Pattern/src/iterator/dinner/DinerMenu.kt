package iterator.dinner

import iterator.MenuItem
import iterator.menu.Menu

class DinerMenu: Menu {
    private val menuItems : Array<MenuItem> by lazy { arrayOf(MenuItem(), MenuItem(), MenuItem(), MenuItem()) }
    private var numberOfItems = 0

    init {
        addItem("채식주의자용 BLT", "통밀 위에 (식물성)베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99)
        addItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99)
        addItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29)
        addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05)
    }

    private fun addItem(name: String, description: String, vegetarian: Boolean, price: Double) {
        val menuItem = MenuItem(name, description, vegetarian, price)
        if (numberOfItems >= MAX_ITEMS) {
            println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.")
        } else {
            menuItems[numberOfItems] = menuItem
            numberOfItems += 1
        }
    }

    override fun createIterator(): Iterator<MenuItem> = menuItems.iterator()

    companion object {
        private const val MAX_ITEMS = 6
    }
}