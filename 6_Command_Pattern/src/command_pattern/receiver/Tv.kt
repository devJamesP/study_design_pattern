package command_pattern.receiver

import command_pattern.factory.ObjFactory

class Tv(sPurpose: String): ObjFactory() {
    private var tvObj: String = ""
    init {
        createFactory(sPurpose)
    }

    override fun createFactory(sPurpose: String) =
        when(sPurpose) {
            "Living Room" -> tvObj = "거실 티비"
            else -> tvObj = ""
        }

    fun on() {
        println("${tvObj}를 켭니다.")
    }

    fun off() {
        println("${tvObj}를 끕니다.")
    }

}