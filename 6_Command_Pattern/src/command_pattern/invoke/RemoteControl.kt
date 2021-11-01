package command_pattern.invoke

import command_pattern.command.Command
import command_pattern.command.NoCommand

class RemoteControl {
    private var onCommands: MutableList<Command> = MutableList(7) { NoCommand() }
    private var offCommands: MutableList<Command> = MutableList(7) { NoCommand() }
    private var undoCommand: Command = NoCommand()

    fun setCommand(slot: Int, _onCommand: Command, _offCommand: Command) {
        onCommands[slot] = _onCommand
        offCommands[slot] = _offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }

    override fun toString(): String {
        val stringBuff: StringBuffer = StringBuffer()
        stringBuff.append("\n----- Remote Control -----\n")

        for (index in onCommands.indices) {
            stringBuff.append("[slot $index] ${onCommands[index].javaClass.name}   ${offCommands[index].javaClass.name}\n")
        }
        return stringBuff.toString()
    }
}