package mvc.model

import mvc.view.BPMObserver
import mvc.view.BeatObserver

interface HeartModelInterface {
    fun getHeartRate() : Int
    fun registerObserver(o : BeatObserver)
    fun removeObserver(o : BeatObserver)
    fun registerObserver(o : BPMObserver)
    fun removeObserver(o : BPMObserver)
}