package iterator.pancakehouse

import iterator.MenuItem

class PancakeHouseMenuIterator(
    private val menuItems: List<MenuItem>
) : Iterator<MenuItem> {
    private var position = 0
    override fun hasNext(): Boolean {
        return position < menuItems.size
    }

    override fun next(): MenuItem {
        return menuItems[position++]
    }
}