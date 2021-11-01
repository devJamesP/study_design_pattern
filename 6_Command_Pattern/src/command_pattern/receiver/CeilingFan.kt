package command_pattern.receiver

import command_pattern.factory.ObjFactory

class CeilingFan(sPurpose: String) : ObjFactory() {
    private var fanObj: String = ""
    private var _speed: Int = OFF
    val speed: Int get() = _speed
    init {
        createFactory(sPurpose)
    }

    override fun createFactory(sPurpose: String) =
        when (sPurpose) {
            "Living Room" -> fanObj = "거실 선풍기"
            else -> fanObj = "선풍기"
        }
    fun off() {
        _speed = OFF
        println("${fanObj}를 끕니다.")
    }

    fun high() {
        _speed = HIGH
        println("최고 속도로 설정합니다.")
    }

    fun medium() {
        _speed = MEDIUM
        println("중간 속도로 설정합니다.")
    }

    fun low() {
        _speed = LOW
        println("낮은 속도로 설정합니다.")
    }

    companion object {
        const val HIGH = 3
        const val MEDIUM = 2
        const val LOW = 1
        const val OFF = 0
    }
}