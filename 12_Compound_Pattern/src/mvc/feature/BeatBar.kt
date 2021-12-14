package mvc.feature

import javax.swing.JProgressBar

class BeatBar: JProgressBar(), Runnable {
    private val thread : Thread by lazy { Thread(this@BeatBar) }
    init {
        maximum = 100
        thread.start()
    }

    override fun run() {
        while(true) {
            var intValue = value;
            intValue = (intValue * .75).toInt()
            value = intValue
            repaint()
            try {
                Thread.sleep(50)
            } catch (e : Exception) { }
        }
    }

    companion object {
        private const val serialVersionUID = 2L
    }
}