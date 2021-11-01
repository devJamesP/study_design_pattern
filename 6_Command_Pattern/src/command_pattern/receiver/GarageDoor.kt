package command_pattern.receiver

import command_pattern.factory.ObjFactory

class GarageDoor(sPurpose: String) : ObjFactory() {
    private var doorObj: String = ""
    init {
        createFactory(sPurpose)
    }

    override fun createFactory(sPurpose: String) =
        when (sPurpose) {
            "Garden" -> doorObj = "정원 문"
            else -> doorObj = "차고 문"
        }

    fun up() {
        println("${doorObj}을 엽니다.")
    }

    fun down() {
        println("${doorObj}을 닫습니다.")
    }

    fun stop() {
        println("$doorObj 동작을 잠시 멈춥니다.")
    }

    fun lightOn() {
        println("$doorObj 라이트를 켭니다.")
    }

    fun lightOff() {
        println("$doorObj 라이트를 끕니다.")
    }
}