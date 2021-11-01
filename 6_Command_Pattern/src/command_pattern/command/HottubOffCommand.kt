package command_pattern.command

import command_pattern.receiver.Hottub

class HottubOffCommand(private val hottub: Hottub): Command {
    override fun execute() {
        hottub.off()
    }

    override fun undo() {
        hottub.on()
    }
}