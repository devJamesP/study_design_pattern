package template

import java.util.Collections.swap

fun sort(_array: List<Comparable<Any>>) {
    val array: List<Comparable<Any>> = _array
    mergeSort(array, _array, 0, _array.size, 0)
}

fun mergeSort(
    src: List<Comparable<Any>>,
    dest: List<Comparable<Any>>,
    low: Int = 0,
    high: Int = 0,
    off: Int = 0
) {
    for (i in low until high) {
        var j = i
        while(j > low && dest[j-1] > dest[j]) {
            swap(dest, j, j-1)
            j--
        }
    }
    return
}