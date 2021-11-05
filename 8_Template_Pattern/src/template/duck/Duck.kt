package template.duck

class Duck(
     val name: String,
     val weight: Int
) : Comparable<Any> {
    override fun compareTo(other: Any): Int {
        return if (other is Duck) {
            when {
                other.weight < this.weight -> 1
                other.weight == this.weight -> 0
                else -> -1
            }
        } else -404
    }
}