package command_pattern.receiver

import command_pattern.factory.ObjFactory

class Stereo(sPurpose: String) : ObjFactory() {
    private var stereoObj: String = ""

    init {
        createFactory(sPurpose)
    }

    override fun createFactory(sPurpose: String) {
        when (sPurpose) {
            "Living Room" -> stereoObj = "거실 스테레오"
        }
    }

    fun on() {
        println("${stereoObj}를 켭니다.")
    }

    fun off() {
        println("${stereoObj}를 끕니다.")
    }

    fun setCd() {
        println("CD를 선택합니다.")
    }

    fun setDvd() {
        println("DVD를 선택합니다.")
    }

    fun setRadio() {
        println("라디오를 선택합니다.")
    }

    fun setVolume(settingVolume: Int) {
        println("볼륨을 ${settingVolume}으로 설정합니다.")
    }
}