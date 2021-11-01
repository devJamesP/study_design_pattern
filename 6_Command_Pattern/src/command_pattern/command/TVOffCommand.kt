package command_pattern.command

import command_pattern.receiver.Tv

class TVOffCommand(private val tv: Tv): Command {
    override fun execute() {
        tv.off()
    }

    override fun undo() {
        tv.on()
    }
}