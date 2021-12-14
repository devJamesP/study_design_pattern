package mvc

import mvc.controller.ControllerInterface
import mvc.hearttest.HeartController
import mvc.hearttest.HeartModel
import mvc.model.HeartModelInterface

fun main() {
    val model : HeartModelInterface = HeartModel()
    val controller : ControllerInterface = HeartController(model)
}



