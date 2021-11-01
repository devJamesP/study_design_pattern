package command_pattern.command

import command_pattern.receiver.Tv

class TVOnCommand(private val tv: Tv): Command {
    override fun execute() {
        tv.on()
    }

    override fun undo() {
        tv.off()
    }
}