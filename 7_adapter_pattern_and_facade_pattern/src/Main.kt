import adapter.iterator_enumeration.IteratorAdapter
import adapter.iterator_enumeration.enumeration.SubEnumeration
import adapter.iterator_enumeration.iterator.SubIterator

fun main() {
    val subIterator = SubIterator()
    val subEnumeration = SubEnumeration()

    println("-----Iterator-----")
    while(subIterator.hasNext()) {
        println("${subIterator.javaClass.name} ${subIterator.next()}")
    }

    println("-----Enumeration-----")
    while(subEnumeration.hasMoreElements()) {
        println("${subEnumeration.javaClass.name} ${subEnumeration.nextElement()}")
    }

    println("-----IteratorAdapter-----")
    val iteratorAdapter = IteratorAdapter(enumeration = subEnumeration)
    while(iteratorAdapter.hasNext()) {
        println("${iteratorAdapter.javaClass.name} ${iteratorAdapter.next()}")
    }

    /** 289쪽 할것!!!!!! */
}