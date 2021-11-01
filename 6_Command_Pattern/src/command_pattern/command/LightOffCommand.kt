package command_pattern.command

import command_pattern.receiver.Light

class LightOffCommand(private val light: Light): Command {
    override fun execute() {
        light.off()
    }
    override fun undo() {
        light.on()
    }
}