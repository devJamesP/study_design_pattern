package starbuz.decorator

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream): FilterInputStream(inputStream) {
    override fun read(): Int {
        val c = super.read()
        return if (c == -1) c else Character.toLowerCase(c.toChar()).code
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val result = super.read(b, off, len)
        for(i in off until off + result) {
            b[i] = Character.toLowerCase(b[i].toInt().toChar()).code.toByte()
        }
        return result
    }
}