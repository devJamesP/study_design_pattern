package command_pattern.invoke

import command_pattern.command.Command

class RemoteControlTest {
    private var slot: Command? = null
    fun setCommand(command: Command) {
        slot = command
    }
    fun buttonPressed() {
        slot?.execute()
    }
}