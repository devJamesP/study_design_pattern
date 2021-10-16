package starbuz.decorator

import starbuz.Beverage
import java.io.BufferedInputStream
import java.io.FileInputStream

abstract class Size: Beverage() {
    abstract override val description: String
    abstract override var size: Double
}