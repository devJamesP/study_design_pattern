package adapter.iterator_enumeration

import java.util.*

class IteratorAdapter(val enumeration: Enumeration<String>): Iterator<String> {
    override fun hasNext(): Boolean = enumeration.hasMoreElements()
    override fun next(): String = enumeration.nextElement()
}