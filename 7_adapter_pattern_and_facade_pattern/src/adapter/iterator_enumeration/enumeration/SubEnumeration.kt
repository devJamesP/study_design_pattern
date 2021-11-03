package adapter.iterator_enumeration.enumeration

import java.util.*

class SubEnumeration: Enumeration<String> {
    private val list: List<String> = listOf("A", "B", "C", "D", "E")
    private var index: Int = 0
    override fun hasMoreElements(): Boolean {
        if (index < list.size) {
            return true
        } else {
            index = 0
        }
        return false
    }
    override fun nextElement(): String {
        if (hasMoreElements()) {
            return list[index++]
        }
        throw IndexOutOfBoundsException("인덱스를 벗어났습니다.")
    }
}