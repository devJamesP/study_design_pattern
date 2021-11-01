package command_pattern

import command_pattern.command.*
import command_pattern.command.ceilingfan.CeilingFanHighCommand
import command_pattern.command.ceilingfan.CeilingFanMediumCommand
import command_pattern.command.ceilingfan.CeilingFanOffCommand
import command_pattern.invoke.RemoteControl
import command_pattern.invoke.SimpleRemoteControl
import command_pattern.receiver.*
import java.rmi.Remote
import kotlin.math.ceil

/** Simple RemoteControl */
//fun main() {
//    val remoteControl = SimpleRemoteControl()
//    val light = Light()
//    val garageDoor = GarageDoor()
//    val lightOnCommand: Command = LightOnCommand(light)
//    val garageDoorCommand: Command = GarageDoorUpCommand(garageDoor)
//
//    remoteControl.setCommand(lightOnCommand)
//    remoteControl.buttonWasPressed()
//
//    remoteControl.setCommand(garageDoorCommand)
//    remoteControl.buttonWasPressed()
//}

/** RemoteControl */
//fun main() {
//    val remoteControl = RemoteControl()
//    val light = Light()
//    val lightOnCommand = LightOnCommand(light)
//    val lightOffCommand = LightOffCommand(light)
//    remoteControl.setCommand(
//        slot = 0,
//        _onCommand = lightOnCommand,
//        _offCommand = lightOffCommand
//    )
//    println(remoteControl.toString())
//
//    remoteControl.onButtonWasPushed(0)
//    remoteControl.offButtonWasPushed(0)
//}

/** RemoteControl extend function */
//fun main() {
//    val remoteControl = RemoteControl()
//
//    val livingRoomLight = Light("Living Room")
//    val kitchenLight = Light("Kitchen")
//    val ceilingFan = CeilingFan("Living Room")
//}

/** Remocontroller Test */
//fun main() {
//    // 일련의 로딩 과정
//    val remoteControl = RemoteControl()
//
//    val livingRoomLight = Light("Living Room")
//    val kitchenLight = Light("KitChen")
//    val ceilingFan = CeilingFan("Living Room")
//    val garageDoor = GarageDoor("")
//    val stereo = Stereo("Living Room")
//
//    val livingRoomLightOn = LightOnCommand(livingRoomLight)
//    val livingRoomLightOff = LightOffCommand(livingRoomLight)
//    val kitchenLightOn = LightOnCommand(kitchenLight)
//    val kitchenLightOff = LightOffCommand(kitchenLight)
//
//    val ceilingFanOn = CeilingFanOnCommand(ceilingFan)
//    val ceilingFanOff = CeilingFanOffCommand(ceilingFan)
//
//    val garageDoorUp = GarageDoorUpCommand(garageDoor)
//    val garageDoorDown = GarageDoorDownCommand(garageDoor)
//
//    val stereoOnWithCD = StereoOnWithCDCommand(stereo)
//    val stereoOffWithCD = StereoOffWithCDCommand(stereo)
//
//    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
//    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff)
//    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff)
//    remoteControl.setCommand(3, garageDoorUp, garageDoorDown)
//    remoteControl.setCommand(4, stereoOnWithCD, stereoOffWithCD)
//
//    println(remoteControl)
//
//    remoteControl.onButtonWasPushed(0)
//    remoteControl.offButtonWasPushed(0)
//    remoteControl.onButtonWasPushed(1)
//    remoteControl.offButtonWasPushed(1)
//    remoteControl.onButtonWasPushed(2)
//    remoteControl.offButtonWasPushed(2)
//    remoteControl.onButtonWasPushed(3)
//    remoteControl.offButtonWasPushed(3)
//    remoteControl.onButtonWasPushed(4)
//    remoteControl.offButtonWasPushed(4)
//}

/** undo 기능 추가 */
//fun main() {
//    val remoteControl = RemoteControl()
//
//    val livingRoomLight = Light("Living Room")
//    val livingRoomLightOn = LightOnCommand(livingRoomLight)
//    val livingRoomLightOff = LightOffCommand(livingRoomLight)
//
//    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff)
//
//    remoteControl.onButtonWasPushed(0)
//    remoteControl.offButtonWasPushed(0)
//    println(remoteControl)
//
//    remoteControl.undoButtonWasPushed()
//    remoteControl.offButtonWasPushed(0)
//    remoteControl.onButtonWasPushed(0)
//    println(remoteControl)
//    remoteControl.undoButtonWasPushed()
//}

/** 선풍기 테스트 */
//fun main() {
//    val remoteControl = RemoteControl()
//
//    val ceilingFan = CeilingFan("Living Room")
//    val ceilingFanMediumCommand = CeilingFanMediumCommand(ceilingFan)
//    val ceilingFanHighCommand = CeilingFanHighCommand(ceilingFan)
//    val ceilingFanOffCommand = CeilingFanOffCommand(ceilingFan)
//
//    remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand)
//    remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand)
//
//    remoteControl.onButtonWasPushed(0)
//    remoteControl.offButtonWasPushed(0)
//    println(remoteControl)
//    remoteControl.undoButtonWasPushed()
//
//    remoteControl.onButtonWasPushed(1)
//    println(remoteControl)
//    remoteControl.undoButtonWasPushed()
//}

/** 파티 모드 */
fun main() {
    val light = Light("Living Room")
    val tv  = Tv("Living Room")
    val stereo = Stereo("Living Room")
    val hottub = Hottub()

    val lightOn = LightOnCommand(light)
    val tvOn = TVOnCommand(tv)
    val stereoOn = StereoOnWithCDCommand(stereo)
    val hottubOn = HottubOnCommand(hottub)

    val lightOff = LightOffCommand(light)
    val tvOff = TVOffCommand(tv)
    val stereoOff = StereoOffWithCDCommand(stereo)
    val hottubOff = HottubOffCommand(hottub)

    val partyOn = listOf(
        lightOn, tvOn, stereoOn, hottubOn
    )

    val partyOff = listOf(
        lightOff, tvOff, stereoOff, hottubOff
    )

    val macroCommandOn = MacroCommand(partyOn)
    val macroCommandOff = MacroCommand(partyOff)

    val remoteControl = RemoteControl()
    remoteControl.setCommand(0, macroCommandOn, macroCommandOff)


    println(remoteControl)
    println("--- Pushing Macro On---")
    remoteControl.onButtonWasPushed(0)

    println("--- Pushing Macro Off---")
    remoteControl.offButtonWasPushed(0)
    println("--- Undo!---")
    remoteControl.undoButtonWasPushed()
}
