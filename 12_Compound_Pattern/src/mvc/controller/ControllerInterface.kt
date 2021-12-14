package mvc.controller

interface ControllerInterface {
    fun start()
    fun stop()
    fun increaseBPM()
    fun decreaseBPM()
    fun setBPM(bpm : Int)
}