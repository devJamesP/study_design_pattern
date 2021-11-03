package adapter.iterator_enumeration.iterator

class SubIterator : Iterator<String> {
    private val list: List<String> = listOf("A", "B", "C", "D", "E")
    private var index: Int = 0
    override fun hasNext(): Boolean {
        if (index < list.size) {
            return true
        } else {
            index = 0
        }
        return false
    }

    override fun next(): String {
        if (hasNext()) {
            return list[index++]
        } else {
            index = 0
        }
        throw IndexOutOfBoundsException("인덱스를 벗어났습니다.")
    }
}