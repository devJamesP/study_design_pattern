package mvc.model

import mvc.view.BPMObserver
import mvc.view.BeatObserver

interface BeatModelInterface {
    fun initialize()
    fun on()
    fun off()
    fun setBPM(bpm: Int)
    fun getBPM(): Int

    fun registerObserver(o: BeatObserver)
    fun removeObserver(o: BeatObserver)
    fun registerObserver(o: BPMObserver)
    fun removeObserver(o: BPMObserver)
}