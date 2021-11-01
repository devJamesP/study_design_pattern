package command_pattern.command

import command_pattern.receiver.Light

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
    override fun undo() {
        light.off()
    }
}