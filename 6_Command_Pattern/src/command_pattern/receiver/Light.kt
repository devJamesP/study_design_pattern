package command_pattern.receiver

import command_pattern.factory.ObjFactory

class Light(sPurpose: String): ObjFactory() {
    private var lightObj: String = ""
    init {
        createFactory(sPurpose)
    }

    override fun createFactory(sPurpose: String) =
        when(sPurpose) {
            "Kitchen" -> lightObj = "부엌 등"
            "Living Room" -> lightObj = "거실 전등"
            else -> lightObj = "전등"
        }
    fun on() {
        println("${lightObj}을 킵니다!")
    }
    fun off() {
        println("${lightObj}을 끕니다!")
    }
}