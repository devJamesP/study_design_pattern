package singleton

// 고전적인 방식(자바 형태)
class Singleton private constructor() {
    var data: Int = 0
    companion object {
        private val uniqueSingleton: Singleton by lazy { Singleton() }
        fun getInstance(): Singleton = uniqueSingleton
    }
}