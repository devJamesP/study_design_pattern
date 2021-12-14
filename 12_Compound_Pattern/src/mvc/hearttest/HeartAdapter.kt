package mvc.hearttest

import mvc.model.BeatModelInterface
import mvc.model.HeartModelInterface
import mvc.view.BPMObserver
import mvc.view.BeatObserver

class HeartAdapter(private val heartModel: HeartModelInterface): BeatModelInterface {
    override fun initialize() {
        
    }

    override fun on() {
        
    }

    override fun off() {
        
    }

    override fun setBPM(bpm: Int) {
        
    }

    override fun getBPM(): Int = heartModel.getHeartRate()

    override fun registerObserver(o: BeatObserver) {
        heartModel.registerObserver(o)
    }

    override fun removeObserver(o: BeatObserver) {
        heartModel.removeObserver(o)
    }

    override fun registerObserver(o: BPMObserver) {
        heartModel.registerObserver(o)

    }

    override fun removeObserver(o: BPMObserver) {
        heartModel.removeObserver(o)
    }
}