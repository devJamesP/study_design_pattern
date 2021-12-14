package mvc.hearttest

import mvc.controller.ControllerInterface
import mvc.model.HeartModelInterface
import mvc.view.DJView

class HeartController(private val model : HeartModelInterface) : ControllerInterface {
    private val view : DJView by lazy { DJView(HeartAdapter(model), this@HeartController,  )}
    init {
        view.createView()
        view.createControls()
        view.disableStopMenuItem()
        view.disableStartMenuItem()
    }
    override fun start() {
        
    }

    override fun stop() {
        
    }

    override fun increaseBPM() {
        
    }

    override fun decreaseBPM() {
        
    }

    override fun setBPM(bpm: Int) {
        
    }
}