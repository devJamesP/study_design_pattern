package iterator.cafemenu

import iterator.MenuItem


class CafeMenuIterator(
    private val menuItems: Map<String, MenuItem>
): Iterator<MenuItem> {
    private var position = 0
    override fun hasNext(): Boolean {
        return position != menuItems.size
    }

    override fun next(): MenuItem {
        return menuItems.values.elementAt(position++)
    }
}