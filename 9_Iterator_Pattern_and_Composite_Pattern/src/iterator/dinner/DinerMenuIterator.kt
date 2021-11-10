package iterator.dinner

import iterator.MenuItem

class DinerMenuIterator(
    private val menuItems: Array<MenuItem>
): Iterator<MenuItem> {
    private var position = 0
    override fun hasNext(): Boolean {
        return position < menuItems.size
    }

    override fun next(): MenuItem {
        return  menuItems[position++]
    }
}