package starbuz

import starbuz.category.DarkRoast
import starbuz.category.Espresso
import starbuz.category.HouseBlend
import starbuz.decorator.LowerCaseInputStream
import starbuz.decorator.addit.Mocha
import starbuz.decorator.addit.Soy
import starbuz.decorator.addit.Whip
import java.io.*

fun main() {
    val beverage = Espresso()
    println("${beverage.description} $${beverage.cost()}")


    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)

    println("${beverage2.description} $${beverage2.cost()}")

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3).apply {
        size = 1.5
    }
    beverage3 = Mocha(beverage3).apply {
        size = 1.5
    }
    beverage3 = Whip(beverage3).apply {
        size = 1.5
    }
    println("${beverage3.description} $${beverage3.cost()}")


    // input test
    var inputStream : InputStream? = null
    try {
        inputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("./src/strText.txt")))
        var c: Int = -1
        do {
            c = inputStream.read()
            if (c > 0) print(c.toChar())
        } while (c > 0)
    } catch (e: Error) {
        error(e.message.toString())
    } finally {
        inputStream?.close()
    }
}