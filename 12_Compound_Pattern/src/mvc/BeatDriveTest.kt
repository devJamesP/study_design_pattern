package mvc

import mvc.controller.BeatController
import mvc.controller.ControllerInterface
import mvc.model.BeatModel
import mvc.model.BeatModelInterface

fun main() {
    val model : BeatModelInterface = BeatModel()
    val controller : ControllerInterface = BeatController(model)
}



