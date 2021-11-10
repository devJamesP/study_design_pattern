package iterator

import iterator.dinner.DinerMenu
import iterator.menu.Menu
import iterator.pancakehouse.PancakeHouseMenu

class Waitress(private val menus: List<Menu>) {
    fun printMenu() {
        menus.forEach { menu ->
            val menuIterators: Iterator<MenuItem> = menu.createIterator()
            printMenuIterator(menuIterators)
        }
    }

    private fun printMenuIterator(iterator: Iterator<MenuItem>) {
//        while(iterator.hasNext()) {
//           println(iterator.next())
//        }
//        for(iter in iterator) {
//            println(iter)
//        }
        iterator.forEach {
            println(it)
        }
        println()
    }
}