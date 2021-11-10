package composite

import java.util.*

class CompositeIterator(
    iterator: Iterator<MenuComponent>
): Iterator<MenuComponent?> {
    private val stack = Stack<Iterator<MenuComponent>>()
    init { stack.push(iterator) }

    override fun hasNext(): Boolean {
        if (stack.empty()) {
            return false
        } else {
            val iterator = stack.peek()
            if (!iterator.hasNext()) {
                stack.pop()
                return hasNext()
            } else {
                return true
            }
        }
    }

    override fun next(): MenuComponent? {
        if (hasNext()) {
            val iterator: Iterator<MenuComponent> = stack.peek()
            val component = iterator.next()
            if (component is Menu) {
                stack.push(component.createIterator())
            }
            return component
        } else {
            return null
        }
    }
}