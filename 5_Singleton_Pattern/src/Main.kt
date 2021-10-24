import singleton.Singleton2
import singleton.Singleton

fun main() {
    val singleton: Singleton = Singleton.getInstance()
    singleton.data = 10
    // before
    println(singleton.data)

    Singleton.getInstance().data = 20
    // after
    println(singleton.data)

    // Modern
    Singleton2.data = 10
    println(Singleton2.data)

    Singleton2.data = 20
    println(Singleton2.data)
}