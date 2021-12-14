package mvc.controller

import mvc.model.BeatModel
import mvc.model.BeatModelInterface
import mvc.view.DJView
import javax.sound.midi.ControllerEventListener

class BeatController(
    private val model : BeatModelInterface,
) : ControllerInterface {
    private val view : DJView = DJView(model, this)
    init {
        view.createView()
        view.createControls()
        view.disableStopMenuItem()
        view.enableStopMenuItem()
        model.initialize()
    }

    override fun start() {
        model.on()
        view.disableStartMenuItem()
        view.enableStartMenuItem()
    }

    override fun stop() {
        model.off()
        view.disableStopMenuItem()
        view.enableStopMenuItem()
    }

    override fun increaseBPM() {
        val bpm = model.getBPM()
        model.setBPM(bpm + 1)
    }

    override fun decreaseBPM() {
        val bpm = model.getBPM()
        model.setBPM(bpm - 1)
    }

    override fun setBPM(bpm: Int) {
        model.setBPM(bpm)
    }
}