package command_pattern.invoke

import command_pattern.command.Command

class SimpleRemoteControl {
    private var slot: Command? = null
    fun setCommand(command: Command) {
        slot = command
    }
    fun buttonWasPressed() {
        slot?.execute()
    }
}