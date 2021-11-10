package iterator.menu

import iterator.MenuItem

interface Menu {
    fun createIterator(): Iterator<MenuItem>
}