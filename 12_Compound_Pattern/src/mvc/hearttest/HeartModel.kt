package mvc.hearttest

import mvc.model.HeartModelInterface
import mvc.view.BPMObserver
import mvc.view.BeatObserver
import java.util.*

class HeartModel: HeartModelInterface, Runnable {
    private val beatObservers = mutableListOf<BeatObserver>()
    private val bpmObservers = mutableListOf<BPMObserver>()
    private var time = 1000
    private var bpm = 90
    private val random = Random(System.currentTimeMillis())
    private val thread by lazy { Thread(this@HeartModel) }
    init {
        thread.start()
    }

    override fun run() {
        var lastRate = -1

        while(true) {
            var change = random.nextInt(10)
            if (random.nextInt(2) == 0) change = 0 - change

            val rate = 60000 / (time + change)
            if (rate in 51 until 120) {
                time += change

                notifyBeatObservers()
                if (rate != lastRate) {
                    lastRate = rate
                    notifyBPMObservers()
                }
            }
            try {
                Thread.sleep(time.toLong())
            } catch (e : Exception) { }
        }
    }

    override fun getHeartRate(): Int = 60000 / time

    override fun registerObserver(o: BeatObserver) {
        beatObservers.add(o)
    }

    override fun removeObserver(o: BeatObserver) {
        val i = beatObservers.indexOf(o)
        if (i >= 0)
            beatObservers.removeAt(i)
    }

    private fun notifyBeatObservers() {
        for (observer in beatObservers)
            observer.updateBeat()
    }

    override fun registerObserver(o: BPMObserver) {
        bpmObservers.add(o)
    }

    override fun removeObserver(o: BPMObserver) {
        val i = bpmObservers.indexOf(o)
        if (i >= 0)
            bpmObservers.removeAt(i)
    }

    private fun notifyBPMObservers() {
        for(observer in bpmObservers)
            observer.updateBPM()
    }



}