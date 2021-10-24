package chocolate

class ChocolateBoiler {
    private var empty: Boolean = true
    val isEmpty: Boolean get() = empty

    private var boiled: Boolean = false
    val isBoiled: Boolean get() = boiled

    fun fill() {
        if (isEmpty) {
            empty = false
            boiled = false
            // 보일러에 우유/초콜릿을 혼합한 재료를 집어넣음.
        }
    }

    fun drain() {
        if (isEmpty.not() && isBoiled) {
            // 끓인 재료를 다음 단계로 넘김
            boiled = true
        }
    }
}