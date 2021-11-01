package command_pattern.command

import command_pattern.receiver.Hottub

class HottubOnCommand(private val hottub: Hottub): Command {
    override fun execute() {
        hottub.on()
    }

    override fun undo() {
        hottub.off()
    }
}